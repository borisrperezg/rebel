package uniandes.rebel.cc.lucidchart;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rebel_componentandconnector.Component;
import rebel_componentandconnector.Connector;
import rebel_componentandconnector.FunctionalView;
import rebel_componentandconnector.Port;
import rebel_componentandconnector.PortType;
import rebel_componentandconnector.Rebel_componentandconnectorFactory;
import rebel_componentandconnector.Rebel_componentandconnectorPackage;
import rebel_componentandconnector.Role;
import rebel_componentandconnector.RoleType;

public class Client {

	public static void main(String[] args) throws Exception {
		// Create a resource set to hold the resources.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(Rebel_componentandconnectorPackage.eNS_URI, Rebel_componentandconnectorPackage.eINSTANCE);
		
		Resource resource = resourceSet.createResource(URI.createURI("http:///My.github"));
		FunctionalView root = Rebel_componentandconnectorFactory.eINSTANCE.createFunctionalView();
		
		Component c1 = Rebel_componentandconnectorFactory.eINSTANCE.createComponent();
		c1.setName("OrderComponent");
		
		Component c2 = Rebel_componentandconnectorFactory.eINSTANCE.createComponent();
		c2.setName("OrderPlacementComponent");
		
		root.getComponents().add(c1);
		root.getComponents().add(c2);
		
		Port c1Port = Rebel_componentandconnectorFactory.eINSTANCE.createPort();
		c1Port.setName("OrderPort");
		c1Port.setType(PortType.REQUIRED);
		c1.getPorts().add(c1Port);
		
		Port c2Port = Rebel_componentandconnectorFactory.eINSTANCE.createPort();
		c2Port.setName("OrderPlacementPort");
		c2Port.setType(PortType.PROVIDED);
		c2.getPorts().add(c2Port);
		
		
		Connector con =  Rebel_componentandconnectorFactory.eINSTANCE.createProcedureCall();
		con.setName("Order_OrderPlacement_Connector");
		con.setProtocol("http");
		
		Role rIn = Rebel_componentandconnectorFactory.eINSTANCE.createRole();
		rIn.setName("roleIn");
		rIn.setType(RoleType.IN);
		rIn.setPort(c2Port);
		
		Role rOut = Rebel_componentandconnectorFactory.eINSTANCE.createRole();
		rOut.setName("roleOut");
		rOut.setType(RoleType.OUT);
		rOut.setPort(c1Port);
		
		con.getRoles().add(rIn);
		con.getRoles().add(rOut);
		
		root.getConnectors().add(con);
		
		resource.getContents().add(root);		
		resource.save(System.out, null);
	}
	
}
