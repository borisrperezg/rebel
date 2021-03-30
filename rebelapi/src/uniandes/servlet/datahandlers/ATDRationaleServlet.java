package uniandes.servlet.datahandlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uniandes.rebelapi.bo.ResponseBO;
import uniandes.rebelapi.mediator.RebelMediator;

public class ATDRationaleServlet extends HttpServlet {

	
	private static final long serialVersionUID = 2429987034773598354L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String boiName = request.getParameter("boiname");
		String projectName = request.getParameter("projname");
		String idFact = request.getParameter("factId");
//		String typeFact = request.getParameter("facttype");
//		String description = request.getParameter("description");
		String justification = request.getParameter("justify");
		String benefits = request.getParameter("benefits");
//		String factFromCnC = request.getParameter("factsname");
		
		String compromisedQA = request.getParameter("compromisedqalist");
		String atdType = request.getParameter("atdcausetypelist");
		
		// Si compromisedQA o causeType están vacios es porque se esta creando una nueva etiqueta para alguno de los dos.
		// En ese caso, se toma el valor de la caja de texto.
		
		System.out.println("1. "+compromisedQA);
		
		if(compromisedQA!=null && compromisedQA.indexOf("? object")>=0)
			compromisedQA = request.getParameter("compromisedqatext");
		
		if(compromisedQA==null || compromisedQA.length()==0)
			compromisedQA = request.getParameter("compromisedqatext");
		
		
		System.out.println("2. "+compromisedQA);
		
		if(atdType!=null && atdType.indexOf("? object")>=0)
			atdType = request.getParameter("atdcausetypetext");
		
		if(atdType==null || atdType.length()==0)
			atdType = request.getParameter("atdcausetypetext");
		
		
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		RebelMediator mediator = new RebelMediator();
//		ResponseBO resp = mediator.storeATDRationale(projectName, boiName, idFact, compromisedQA, atdType, justification, benefits, factFromCnC);
		ResponseBO resp = mediator.storeATDRationale(projectName, boiName, idFact, compromisedQA, atdType, justification, benefits, null);
		
		if(resp.getResponse().equals("OK")) {
			
			out.println(docType + "<html>\n" + 
					"<title>Why ATD?</title>\n" + 
					"<head>\n" + 
					"    \n" + 
					"    <title>Justify why the fact could be considered an ATD item</title>\n" + 
					"    \n" + 
					"    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n" + 
					"	<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n" + 
					"	<link rel=\"icon\" type=\"image/png\" href=\"favicon-16x16.png\" sizes=\"16x16\">\n" + 
					"	<link rel=\"icon\" type=\"image/png\" href=\"favicon-16x16.png\" sizes=\"16x16\">\n" + 
					"    \n" + 
					"    <!-- STYLES -->\n" + 
					"	<link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@0.6.2/build/pure-min.css\" integrity=\"sha384-UQiGfs9ICog+LwheBSRCt1o5cbyKIHbwjWscjemyBMT9YCUMZffs6UqUTd0hObXD\" crossorigin=\"anonymous\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway:200\">\n" + 
					"	<link rel=\"stylesheet\" href=\"/rebelviz/css/style.css\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/animatecss/3.5.2/animate.min.css\" />\n" + 
					"	\n" + 
					"</head>\n" + 
					"\n" + 
					"<body>\n" + 
					"\n" + 
					"<div id=\"main\">\n" + 
					"\n" + 
					"	<div class=\"header\">\n" + 
					"	    <h1>Why ATD?</h1>\n" + 
					"	</div>\n" + 
					"	\n" + 
					"	<div class=\"content\">\n" + 
					"	\n" + 
					"		<div id=\"default-buttons\" class=\"content-subhead\">\n" + 
					"			\n" +  
					"				<label for=\"boiname\">Justification successfully saved</label>\n" + 
					"				\n" + 
					"				<br/><br/>\n" + 
					"				<input type=\"button\" onclick=\"javascript:window.close('','_parent','');\" value=\"Close\">\n" +
					"		</div>\n" + 
					"	</div>\n" + 
					"</div>\n" + 
					"</body>\n" + 
					"<script>\n" + 
					"window.opener.location.reload(false);\n" + 
					"</script>" +
					"</html>");
			
		}else {
			out.println(docType + "<html>\n" + 
					"<title>Why ATD?</title>\n" + 
					"<head>\n" + 
					"    \n" + 
					"    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n" + 
					"	<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n" + 
					"	<link rel=\"icon\" type=\"image/png\" href=\"favicon-16x16.png\" sizes=\"16x16\">\n" + 
					"	<link rel=\"icon\" type=\"image/png\" href=\"favicon-16x16.png\" sizes=\"16x16\">\n" + 
					"    \n" + 
					"    <!-- STYLES -->\n" + 
					"	<link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@0.6.2/build/pure-min.css\" integrity=\"sha384-UQiGfs9ICog+LwheBSRCt1o5cbyKIHbwjWscjemyBMT9YCUMZffs6UqUTd0hObXD\" crossorigin=\"anonymous\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway:200\">\n" + 
					"	<link rel=\"stylesheet\" href=\"/rebelviz/css/style.css\">\n" + 
					"	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/animatecss/3.5.2/animate.min.css\" />\n" + 
					"	\n" + 
					"</head>\n" + 
					"\n" + 
					"<body>\n" + 
					"\n" + 
					"<div id=\"main\">\n" + 
					"\n" + 
					"	<div class=\"header\">\n" + 
					"	    <h1>Why ATD?</h1>\n" + 
					"	</div>\n" + 
					"	\n" + 
					"	<div class=\"content\">\n" + 
					"	\n" + 
					"		<div class=\"content-subhead\">\n" + 
					"			\n" + 
					"			\n" + 
					"				<label>Umm... Something went wrong.</label>\n" + 
					"				<br/>\n" + 
					"				<label>What happened? "+resp.getDescription()+" </label>\n" + 
					"				<br/><br/>\n" + 
					"				<input type=\"button\" onclick=\"javascript:window.close('','_parent','');\" value=\"Close\">\n" + 
					"			\n" + 
					"		</div>\n" + 
					"	</div>\n" + 
					"</div>\n" + 
					"</body>\n" + 
					"</html>");
		}
		
		
	}

	// Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}