package uniandes.rebel.archimate;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.resource.Resource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import rebel_archimate.Project;
import rebel_archimate.Relation;
import rebel_archimate.View;

/**
 * Esta clase se usa para para transformar el rebel_archimate a un xml 
 * que se pueda leer por la libreria de draw.io para visualizacion únicamente.
 * @author borisperezg
 *
 */
public class ArchiToXML {

	public static void main(String[] args) throws Exception {
		ArchiToXML xml = new ArchiToXML();
		xml.xmlCreation("Layered_20201109", "ANG");
	}
	
	
	/**
	 * 
	 * @param xmlFileName
	 * @param projectName Se utiliza para crear estructura de carpetas, y mantener las vistas de los modelos separadas de acuerdo al proyecto
	 * @return
	 * @throws Exception
	 */
	public boolean xmlCreation(String xmlFileName, String projectName) throws Exception  {
		
		AMModel amModel = new AMModel();
		
		boolean resp = false;
		
		// Se guarda el archivo en dos ubicaciones, la carpeta en ejecucion en el tomcat, y la carpeta en desarrollo.
		// De esta forma, cuando se redespliegue, no se pierden los xml creados.
		
		// Validar que exista la carpeta
		
		String xmlRunningFilePath = "/Users/borisperezg/apache-tomcat-7.0.100/webapps/rebelviz/archimatemodels/"+projectName;
		if(checkOrCreateFolder(xmlRunningFilePath))
			xmlRunningFilePath += "/"+xmlFileName+".xml";
		
		String xmlSourceFilePath = "/Users/borisperezg/eclipsews/rebelviz/WebContent/archimatemodels/"+projectName;
		if(checkOrCreateFolder(xmlSourceFilePath))
			xmlSourceFilePath += "/"+xmlFileName+".xml";
		 
		// Open and read XML
//		Document docRebelArchimate = ArchimateUtil.parseXML("/Users/borisperezg/rebel/"+projectName+"/archimate/"+xmlFileName);
		Resource res = amModel.loadResource("/Users/borisperezg/rebel/"+projectName+"/archimate/"+xmlFileName+".rebel_archimate");
		
		if(res!=null) {
			
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();		 
	        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
	        Document docGraph = documentBuilder.newDocument();
	        
	        // root element
	        Element mxGraphModel = docGraph.createElement("mxGraphModel");
	        docGraph.appendChild(mxGraphModel);
	        
	        attributesCreationForGraphModel(docGraph, mxGraphModel);
	        
	        Element root = docGraph.createElement("root");
	        mxGraphModel.appendChild(root);
	        
	        Element mxCell = docGraph.createElement("mxCell");
	        root.appendChild(mxCell);
	        Attr attr = docGraph.createAttribute("id");
	        attr.setValue("0");
	        mxCell.setAttributeNode(attr);
	        
	        mxCell = docGraph.createElement("mxCell");
	        root.appendChild(mxCell);
	        attr = docGraph.createAttribute("id");
	        attr.setValue("1");
	        mxCell.setAttributeNode(attr);
	        attr = docGraph.createAttribute("parent");
	        attr.setValue("0");
	        mxCell.setAttributeNode(attr);
	        
	        // -----------------------------------------------------------
	        // PROCESAMIENTO DE LOS ELEMENTOS Y LAS RELACIONES	
	        // -----------------------------------------------------------
	        
	        Project project = (Project) res.getContents().get(0);
	        List<View> views = project.getView();
	        if(views!=null) {
	        	for(View view : views) {
	        		
	        		// ----------------------------------------
	        		// Procesando los elementos
	        		
	        		List<rebel_archimate.Element> elementNodes = view.getElement();
	        		if(elementNodes!=null) {
	        			for(rebel_archimate.Element elementNode : elementNodes) {
	        			
		    				String id = elementNode.getId();
		    				String name = elementNode.getName();
		    				String type = elementNode.getType().getName();
		    				
		    				String x = String.valueOf(elementNode.getPosX());
		    				String y = String.valueOf(elementNode.getPosY());
//		    				String w = String.valueOf(type.equals("APPLICATION_COMPONENT")?elementNode.getWidth()+80:elementNode.getWidth());
		    				String w = String.valueOf(elementNode.getWidth());
		    				String h = String.valueOf(elementNode.getHeight());
		    				String isGrouper = String.valueOf(elementNode.isGrouper());
		    				
		    				// Solo para cuando se tienen componentes porque en la visualización
							// se presenta de forma extraña
							
		    				root.appendChild(createMxCellElement(docGraph, id, name, 
		    						type, x, y, w, h, isGrouper));
		    				
		    				
		    			}
		        	}
	        		
	        		// ----------------------------------------
	        		// Procesando las relaciones
	        		
	        		List<rebel_archimate.Relation> relationNodes = view.getRelation();
	        		if(relationNodes!=null) {
	        			for(Relation relationNode : relationNodes) {
	        				
	        				rebel_archimate.Element elementSource = relationNode.getSource();
	        				rebel_archimate.Element elementTarget = relationNode.getTarget();
	        				String id = relationNode.getId();
	        				String type = relationNode.getType().getName();
	        				
	        				if(!type.equals("COMPOSITION"))
	        					root.appendChild(createMxCellRelation(docGraph, id, type, elementSource, elementTarget));
	        				else {
	        					// ****************************************
	        					// Preguntar si uno está dentro del otro
	        					// ****************************************
	        					
	        					int anchura = elementSource.getPosX() + elementSource.getWidth();
	        					int altura = elementSource.getPosY() + elementSource.getHeight();
	        					
	        					if(anchura < elementTarget.getPosX() || altura < elementTarget.getPosY())
	        						root.appendChild(createMxCellRelation(docGraph, id, type, elementSource, elementTarget));

	        				}
	        			}
	        		}
		        }
	        }
	        
	        
	        // -----------------------------------------------------------
	        
	        // create the xml file
	        // transform the DOM Object to an XML File
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
	        
	        DOMSource domSource = new DOMSource(docGraph);
	        StreamResult streamResultWebApp = new StreamResult(new File(xmlRunningFilePath));
	        StreamResult streamResultSourceAppFolder = new StreamResult(new File(xmlSourceFilePath));

	        transformer.transform(domSource, streamResultWebApp);
	        transformer.transform(domSource, streamResultSourceAppFolder);

	        resp = true;
		}
		
		return resp;
		
	}
	
	private Element createMxCellRelation(Document document, String id, String type, 
			rebel_archimate.Element elementSource, rebel_archimate.Element elementTarget) {
		
		Element mxCell = createMxCellRelation(document, id, type, elementSource.getId(), elementTarget.getId());
		Element mxGeometry = createMxGeometryRelation(document, elementSource, elementTarget);
		mxCell.appendChild(mxGeometry);
		return mxCell;
	}
	
	private Element createMxCellRelation(Document document, String id, String type, String elementSourceId, String elementTargetId) {
		Element mxCell = document.createElement("mxCell");
        
		Attr attr = document.createAttribute("edge");
        attr.setValue("1");
        mxCell.setAttributeNode(attr);
        attr = document.createAttribute("parent");
        attr.setValue("1");
        mxCell.setAttributeNode(attr);
		
        
        if(!type.equals("COMPOSITION")) {
			attr = document.createAttribute("id");
	        attr.setValue(id);
	        mxCell.setAttributeNode(attr);
	        attr = document.createAttribute("source");
	        attr.setValue(elementSourceId);
	        mxCell.setAttributeNode(attr);
	        attr = document.createAttribute("target");
	        attr.setValue(elementTargetId);
	        mxCell.setAttributeNode(attr);
        }else {
        	// Por cosas de la vida, la composicion la construye al revés. De ahí que tocara hacer esto.
        	// Queda pendiente hacer pruebas para estar seguro.
        	attr = document.createAttribute("id");
	        attr.setValue(id);
	        mxCell.setAttributeNode(attr);
	        attr = document.createAttribute("source");
	        attr.setValue(elementTargetId);
	        mxCell.setAttributeNode(attr);
	        attr = document.createAttribute("target");
	        attr.setValue(elementSourceId);
	        mxCell.setAttributeNode(attr);
        }
        
        attr = document.createAttribute("style");        
        if(type.equals("REALIZATION"))
        	attr.setValue("edgeStyle=elbowEdgeStyle;html=1;endArrow=block;elbow=vertical;endFill=0;dashed=1;");
        else if(type.equals("SERVING"))
        	attr.setValue("edgeStyle=elbowEdgeStyle;html=1;endArrow=open;elbow=vertical;endFill=1;");
        else if(type.equals("TRIGGERING"))
        	attr.setValue("edgeStyle=elbowEdgeStyle;html=1;endArrow=block;dashed=0;elbow=vertical;endFill=1;");
        else if(type.equals("ACCESS"))
        	attr.setValue("edgeStyle=elbowEdgeStyle;html=1;endArrow=open;elbow=vertical;endFill=0;dashed=1;dashPattern=1 4;");
        else if(type.equals("ASSOCIATION"))
        	attr.setValue("edgeStyle=elbowEdgeStyle;html=1;endArrow=none;elbow=vertical;");
        else if(type.equals("COMPOSITION"))
        	attr.setValue("html=1;endArrow=diamondThin;endFill=1;edgeStyle=elbowEdgeStyle;elbow=vertical;endSize=10;");
        
        mxCell.setAttributeNode(attr);
        
        
        return mxCell;
	}
	
	private Element createMxGeometryRelation(Document document, rebel_archimate.Element elementSource, rebel_archimate.Element elementTarget) {
		Element mxGeometry = document.createElement("mxGeometry");
        
        
        Attr attr = document.createAttribute("width");
        attr.setValue("160");
        mxGeometry.setAttributeNode(attr);
        
        attr = document.createAttribute("relative");
        attr.setValue("1");
        mxGeometry.setAttributeNode(attr);
        
        attr = document.createAttribute("as");
        attr.setValue("geometry");
        mxGeometry.setAttributeNode(attr);
        
        // Validar si la relación es vertical u horizontal
        int posiciones[] = getSourceAndTargetPositions(elementSource, elementTarget);
        
        
        // Point Source
        Element mxPointSource = document.createElement("mxPoint");
        
        Attr attribute = document.createAttribute("x");
        attribute.setValue(""+posiciones[0]);
        mxPointSource.setAttributeNode(attribute);
        
        attribute = document.createAttribute("y");
        attribute.setValue(""+posiciones[1]);
        mxPointSource.setAttributeNode(attribute);
        
        attribute = document.createAttribute("as");
        attribute.setValue("sourcePoint");
        mxPointSource.setAttributeNode(attribute);
        
        mxGeometry.appendChild(mxPointSource);
        
        // Point Target
        Element mxPointTarget = document.createElement("mxPoint");
        
        attribute = document.createAttribute("x");
        attribute.setValue(""+posiciones[2]);
        mxPointTarget.setAttributeNode(attribute);
        
        attribute = document.createAttribute("y");
        attribute.setValue(""+posiciones[3]);
        mxPointTarget.setAttributeNode(attribute);
        
        attribute = document.createAttribute("as");
        attribute.setValue("targetPoint");
        mxPointTarget.setAttributeNode(attribute);
        
        mxGeometry.appendChild(mxPointTarget);
        
        return mxGeometry;
	}
	
	/**
	 * Obtiene la posicion X desde donde arrancara la relacion
	 * @return int[] posiciones X,Y del source y X,Y del target
	 */
	private int[] getSourceAndTargetPositions(rebel_archimate.Element elementSource, rebel_archimate.Element elementTarget) {

		int[] posSourceAndTarget = new int[4];
		
		String ubicaciones = getRelativePositionSourceVsTarget(elementSource, elementTarget);
//		System.out.println("ubicaciones = "+ubicaciones);
		if(!ubicaciones.isEmpty()) {
			String ladoOrigen = ubicaciones.substring(0,1);
			String ladoDest = ubicaciones.substring(1,2);
			
			if(ladoOrigen.equals("t")) {
				
				posSourceAndTarget[0] = elementSource.getPosX() + elementSource.getWidth() / 2;
				posSourceAndTarget[1] = elementSource.getPosY();
				
			}else if(ladoOrigen.equals("b")) {
				
				posSourceAndTarget[0] = elementSource.getPosX() + elementSource.getWidth() / 2;
				posSourceAndTarget[1] = elementSource.getPosY() + elementSource.getHeight();
				
			}else if(ladoOrigen.equals("l")) {
				
				posSourceAndTarget[0] = elementSource.getPosX();
				posSourceAndTarget[1] = elementSource.getPosY() + elementSource.getHeight() / 2;
				
			}else {
				
				posSourceAndTarget[0] = elementSource.getPosX() + elementSource.getWidth();
				posSourceAndTarget[1] = elementSource.getPosY() + elementSource.getHeight() / 2;
				
			}
			
			if(ladoDest.equals("t")) {
				
				posSourceAndTarget[2] = elementTarget.getPosX() + elementTarget.getWidth() / 2;
				posSourceAndTarget[3] = elementTarget.getPosY();
				
			}else if(ladoDest.equals("b")) {
				
				posSourceAndTarget[2] = elementTarget.getPosX() + elementTarget.getWidth() / 2;
				posSourceAndTarget[3] = elementTarget.getPosY() + elementTarget.getHeight();
				
			}else if(ladoDest.equals("l")) {
				
				posSourceAndTarget[2] = elementTarget.getPosX();
				posSourceAndTarget[3] = elementTarget.getPosY() + elementTarget.getHeight() / 2;
				
			}else {
				
				posSourceAndTarget[2] = elementTarget.getPosX() + elementTarget.getWidth();
				posSourceAndTarget[3] = elementTarget.getPosY() + elementTarget.getHeight() / 2;
				
			}
		}
		
		return posSourceAndTarget;
	}
	
	/**
	 * Este metodo obtiene la ubicacion del elemento fuente en comparacion con el elemento de destino
	 * @return Podría returnar un String con el lado del cual deberia salir el origen y el lado con el que recibe el target. Los posibles valores son: lrtb. 
	 * El retorno sería un String de la forma lr. Donde el primer caracter indica que el source sale por la izquierda, y el target recibe por la derecha.
	 */
	private String getRelativePositionSourceVsTarget(rebel_archimate.Element elementSource, rebel_archimate.Element elementTarget) {
		
		String retorno = "";
		
		int posYSource = elementSource.getPosY();
		int hSource = elementSource.getHeight();
		int posXSource = elementSource.getPosX();
				
		int posYTarget = elementTarget.getPosY();
		int hTarget = elementTarget.getHeight();
		int posXTarget = elementSource.getPosX();
		int wTarget = elementSource.getWidth();
		
		// Si esto se cumple, significa que el source sale por encima
		if((posYTarget + hTarget)<posYSource) {			
			retorno = "tb";
		
		// Si esto se cumple, significa que el source sale por el lado
		}else if((posYSource + hSource)<posYTarget) {
			retorno = "bt";
		
		// Si están para salir por el lado. Target a la izquierda
		}else if((posXTarget + wTarget)<posXSource) {
			retorno = "lr";
		}else {
			retorno = "rl";
		}
		
		return retorno;
	}
	
	/**
	 * 
	 * @param document
	 * @param id
	 * @param value
	 * @param type
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 * @param isGrouper Para cuando el elemento esta agrupando a otros elementos
	 * @return
	 */
	private Element createMxCellElement(Document document, String id, String value, 
			String type, String x, String y, String w, String h, String isGrouper) {
		Element mxCell = createMxCell(document, id, value, type, isGrouper);
		Element mxGeometry = createMxGeometry(document, x, y, w, h);
		mxCell.appendChild(mxGeometry);
		return mxCell;
	}
	
	/**
	 * Este metodo crea los elementos y asigna el estilo de acuerdo al tipo.
	 * @param document
	 * @param id
	 * @param value
	 * @param type
	 * @return
	 */
	private Element createMxCell(Document document, String id, String value, String type, String isGrouper) {
		Element mxCell = document.createElement("mxCell");
        
		Attr attr = document.createAttribute("vertex");
        attr.setValue("1");
        mxCell.setAttributeNode(attr);
        attr = document.createAttribute("parent");
        attr.setValue("1");
        mxCell.setAttributeNode(attr);
				
		attr = document.createAttribute("id");
        attr.setValue(id);
        mxCell.setAttributeNode(attr);
        attr = document.createAttribute("value");
        attr.setValue(value);
        mxCell.setAttributeNode(attr);
        
        attr = document.createAttribute("style");
        
        if(type.equals("MOTIVATION_STAKEHOLDER"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#CCCCFF;shape=mxgraph.archimate3.application;appType=role;archiType=oct;align=center;");
        else if(type.equals("MOTIVATION_DRIVER"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#CCCCFF;shape=mxgraph.archimate3.application;appType=driver;archiType=oct;align=center;");
        else if(type.equals("MOTIVATION_GOAL"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#CCCCFF;shape=mxgraph.archimate3.application;appType=goal;archiType=oct;align=center;");
        else if(type.equals("MOTIVATION_OUTCOME"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#CCCCFF;shape=mxgraph.archimate3.application;appType=outcome;archiType=oct;align=center;");
        else if(type.equals("MOTIVATION_REQUIREMENT"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#CCCCFF;shape=mxgraph.archimate3.application;appType=requirement;archiType=oct;align=center;");
        
        else if(type.equals("BUSINESS_SERVICE"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#ffff99;shape=mxgraph.archimate3.application;appType=serv;archiType=rounded;");
        else if(type.equals("BUSINESS_PROCESS"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#ffff99;shape=mxgraph.archimate3.application;appType=proc;archiType=rounded;");
        else if(type.equals("BUSINESS_COLLABORATION"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#ffff99;shape=mxgraph.archimate3.application;appType=collab;archiType=square;align=center;");
        
        else if(type.equals("APPLICATION_SERVICE"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#99ffff;shape=mxgraph.archimate3.application;appType=serv;archiType=rounded");
        else if(type.equals("APPLICATION_COMPONENT"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#99ffff;shape=mxgraph.archimate3.component;");
        else if(type.equals("APPLICATION_COLLABORATION"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#99ffff;shape=mxgraph.archimate3.application;appType=collab;archiType=square;");
        else if(type.equals("APPLICATION_INTERFACE"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#99ffff;shape=mxgraph.archimate3.application;appType=interface;archiType=square;");
        
        else if(type.equals("DATAOBJECT"))
        	attr.setValue("html=1;outlineConnect=0;whiteSpace=wrap;fillColor=#99ffff;shape=mxgraph.archimate3.businessObject;overflow=fill;");
        
        if(isGrouper.equals("true")) {
        	attr.setValue(attr.getValue()+"verticalAlign=top;align=left;");
        }
        
        mxCell.setAttributeNode(attr);
        
        
        return mxCell;
	}
	
	private Element createMxGeometry(Document document, String x, String y, String w, String h) {
		Element mxGeometry = document.createElement("mxGeometry");
        
        
        Attr attr = document.createAttribute("x");
        attr.setValue(x);
        mxGeometry.setAttributeNode(attr);
        attr = document.createAttribute("y");
        attr.setValue(y);
        mxGeometry.setAttributeNode(attr);
        attr = document.createAttribute("width");
        attr.setValue(w);
        mxGeometry.setAttributeNode(attr);
        attr = document.createAttribute("height");
        attr.setValue(h);
        mxGeometry.setAttributeNode(attr);
        attr = document.createAttribute("as");
        attr.setValue("geometry");
        mxGeometry.setAttributeNode(attr);
        
        return mxGeometry;
	}
	
	private void attributesCreationForGraphModel(Document document, Element root) {
		Attr attr = document.createAttribute("dx");
        attr.setValue("786");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("dy");
        attr.setValue("447");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("grid");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("gridSize");
        attr.setValue("10");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("guides");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("tooltips");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("connect");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("arrows");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("fold");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("page");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("pageScale");
        attr.setValue("1");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("pageWidth");
        attr.setValue("827");
        root.setAttributeNode(attr);
        
        attr = document.createAttribute("pageHeight");
        attr.setValue("1169");
        root.setAttributeNode(attr);
	}
	
	/**
	 * Esta carpeta valida si existe la ruta indicada. Se pasa la ruta completa porque se usarán
	 * dos rutas para crear archivos.
	 * @param path Esta es la ruta completa para insetar
	 * @return
	 */
	public static boolean checkOrCreateFolder(String folderName) {
		boolean isReady = false;
		
		File folder = new File(folderName);
		if(folder.exists()) {
			isReady = true;
		}else {
			isReady = folder.mkdir();			
		}
		
		return isReady;
	}
	
}
