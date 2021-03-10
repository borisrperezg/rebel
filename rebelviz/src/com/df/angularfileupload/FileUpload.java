package com.df.angularfileupload;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

public class FileUpload extends HttpServlet {
    private static final long serialVersionUID = -8244073279641189889L;
    private final Logger log = Logger.getLogger(FileUpload.class.getName());

    class SizeEntry {
        public int size;
    }

    static Map<String, SizeEntry> sizeMap = new ConcurrentHashMap<>();
    int counter;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {

            String ipAddress = req.getHeader("X-FORWARDED-FOR");
            if (ipAddress == null) {
                ipAddress = req.getRemoteAddr();
            }
            if (req.getMethod().equalsIgnoreCase("GET")) {
                if (req.getParameter("restart") != null) {
                    sizeMap.remove(ipAddress + req.getParameter("name"));
                }
                SizeEntry entry = sizeMap.get(ipAddress + req.getParameter("name"));
                res.getWriter().write("{\"size\":" + (entry == null ? 0 : entry.size) + "}");
                res.setContentType("application/json");
                return;
            }
            req.setCharacterEncoding("utf-8");
            if (!"OPTIONS".equalsIgnoreCase(req.getMethod()) && req.getParameter("errorCode") != null) {
                res.sendError(Integer.parseInt(req.getParameter("errorCode")), req.getParameter("errorMessage"));
                return;
            }
            
            // Write the file to disk
            ServletFileUpload upload = new ServletFileUpload();
            FileItemIterator iterator = upload.getItemIterator(req);

            while (iterator.hasNext()) {
                FileItemStream item = iterator.next();
                
                InputStream in = item.openStream();
                
                if(item.getName()!=null && item.getName().length()>0 && !item.getName().equals("null")) {
                	
                	File targetFile = new File("/Users/borisperezg/temporaluploadfolder/" + item.getName());
                	System.out.println(targetFile.getAbsolutePath());
                	FileUtils.copyInputStreamToFile(in, targetFile);
                	
                	callWebService(req.getParameter("project"), req.getParameter("artifactType"), item.getName());
                	
                	break;
                }
            }
            
            
            // Send the json notification for successful upload the file
            sendAnswer(req, res);
            
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
    
    public void callWebService(String project, String artifactType, String fileName) {
    	StringBuilder strBuf = new StringBuilder();  
    	
    	HttpURLConnection conn=null;
        BufferedReader reader=null;
        try{  
        	
        	project = project.replaceAll(" ", "%20");
        	fileName = fileName.replaceAll(" ", "%20");
        	
        	String urlString = "http://localhost:8080/rebelapi/rest/rebel/buildxmi/p="+project+"&a="+artifactType+"&n="+fileName;
        	System.out.println("FileUpload.callWebService ::: "+urlString);
        	
            //Declare the connection to weather api url
            URL url = new URL(urlString);  
            conn = (HttpURLConnection)url.openConnection();  
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
            System.out.println("FileUpload.callWebService ::: conn.getResponseCode() = "+conn.getResponseCode());
            
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HTTP GET Request Failed with Error code : "
                              + conn.getResponseCode());
            }
            
            //Read the content from the defined connection
            //Using IO Stream with Buffer raise highly the efficiency of IO
	        reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
            String output = null;  
            while ((output = reader.readLine()) != null)  
                strBuf.append(output);  
        }catch(MalformedURLException e) {  
            e.printStackTrace();   
        }catch(IOException e){  
            e.printStackTrace();   
        }
        finally
        {
            if(reader!=null)
            {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null)
            {
                conn.disconnect();
            }
        }
    }
    
    private void sendAnswer(HttpServletRequest req, HttpServletResponse res) throws Exception {
    	StringBuilder sb = new StringBuilder("{\"result\": [");

        if (req.getHeader("Content-Type") != null
                && req.getHeader("Content-Type").startsWith("multipart/form-data")) {
            
        	ServletFileUpload upload = new ServletFileUpload();
            FileItemIterator iterator = upload.getItemIterator(req);

            while (iterator.hasNext()) {
                FileItemStream item = iterator.next();
                
                InputStream in = item.openStream();
                
                if(item.getName()!=null && item.getName().length()>0 && !item.getName().equals("null")) {
                	File targetFile = new File("/Users/borisrainieroperezgutierrez/Desktop/Upkeep_w" + item.getName());
                	System.out.println(targetFile.getAbsolutePath());
                	FileUtils.copyInputStreamToFile(in, targetFile);
                }
                
                
                // The destination of your uploaded files.
                
                sb.append("{");
                sb.append("\"fieldName\":\"").append(item.getFieldName()).append("\",");
                if (item.getName() != null) {
                    sb.append("\"name\":\"").append(item.getName()).append("\",");
                }
                if (item.getName() != null) {
                    sb.append("\"size\":\"").append(3).append("\"");
                } else {
                    sb.append("\"value\":\"").append(read(in).replace("\"", "'")).append("\"");
                }
                sb.append("}");
                if (iterator.hasNext()) {
                    sb.append(",");
                }
            }
        } 

        sb.append("]");
        sb.append(", \"requestHeaders\": {");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            if(!header.equals("cookie")) {
                sb.append("\"").append(header).append("\":\"").append(req.getHeader(header)).append("\"");
                if (headerNames.hasMoreElements()) {
                	sb.append(",");
                }
            }else {
            	sb = new StringBuilder(sb.substring(0, sb.length()-1));
            }
        }
        sb.append("}}");
        res.setCharacterEncoding("utf-8");
        res.getWriter().write(sb.toString());
    }

    protected String read(InputStream stream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                //ignore
            }
        }
        return sb.toString();
    }
}
