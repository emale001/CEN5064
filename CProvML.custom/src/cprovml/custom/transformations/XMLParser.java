package cprovml.custom.transformations;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;






import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
import javax.xml.transform.OutputKeys;  
import javax.xml.transform.Transformer;  
import javax.xml.transform.TransformerConfigurationException;  
import javax.xml.transform.TransformerException;  
import javax.xml.transform.TransformerFactory;  
import javax.xml.transform.dom.DOMSource;  
import javax.xml.transform.stream.StreamResult;  
  







import org.w3c.dom.Attr;  
import org.w3c.dom.Document;  
import org.w3c.dom.Element;  
import org.w3c.dom.Node;  
import org.w3c.dom.NodeList;  
import org.xml.sax.SAXException;  


public class XMLParser {
	private static Document document;  
    
    public static void init() {  
        try {  
            DocumentBuilderFactory factory = DocumentBuilderFactory  
                    .newInstance();  
            DocumentBuilder builder = factory.newDocumentBuilder();  
            document = builder.newDocument();  
        } catch (ParserConfigurationException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
    public static void transformCprovml(String fileName) {  
           init();  
            Element xml = document.createElement("cloudProvision");   //create root node  
            document.appendChild(xml);
            
			try {
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
	            DocumentBuilder db;
				db = dbf.newDocumentBuilder();
				Document document1 = db.parse(fileName);
				Element CProvML = document1.getDocumentElement();
				
				/*1 create the nodes.#-name map*/
				HashMap<String, String> hashmap = new HashMap();
				HashMap<String, String> hashmap2 = new HashMap();
				HashMap<String, String> hashmap3 = new HashMap();


				List<Pair> list = new ArrayList();
			
				
				System.out.println("first child name:"+CProvML.getNodeName());
				NodeList nodes = CProvML.getElementsByTagName("nodes");
				System.out.println(nodes.getLength());
				
				for(int i=0;i<nodes.getLength();i++){
					Element n=(Element)nodes.item(i);
					String s=n.getAttribute("xsi:type");
				    System.out.println(s);
					String arr[]=s.split(":");
									
					NodeList chileNodes = n.getElementsByTagName("sourceConnections");
					if(chileNodes.getLength()!=0){
					    Element n1=(Element)chileNodes.item(0);
					    
						
					    System.out.println("put key-vlue:"+n1.getAttribute("source")+"-"+n.getAttribute("name"));
					    hashmap.put(n1.getAttribute("source"), n.getAttribute("name"));
					 
					    hashmap2.put(n1.getAttribute("source"), arr[1].toLowerCase());
					}else{
						hashmap.put(n.getAttribute("name"), n.getAttribute("name"));
					    hashmap2.put(n.getAttribute("name"), arr[1].toLowerCase());
						
					}
					for (int e=0;e<chileNodes.getLength();e++){
						
						Element n2=(Element)chileNodes.item(0);
						Pair p =new Pair(n2.getAttribute("source"),n2.getAttribute("target"));
						list.add(p);
					}
					    
				}
				System.out.println("hashmap.size = "+hashmap.size());
				System.out.println(list.size());
				/*2create xml file*/
				for(int i=0;i<nodes.getLength();i++){
					Element n=(Element)nodes.item(i);
					 NodeList tmpNodes = n.getElementsByTagName("sourceConnections");
					
					//if the item is not 'Environment'
					if(!n.getAttribute("xsi:type").equals("CProvML:Environment")){
						String s=n.getAttribute("xsi:type");
						String arr[]=s.split(":");
		
								Element node = document.createElement(arr[1].toLowerCase());  
								Attr AttrName = document.createAttribute("name");              
								AttrName.setValue(n.getAttribute("name"));
								
								node.setAttributeNode(AttrName); 
					            
					            
					            Element connections = document.createElement("connections");
					            NodeList chileNodes = n.getElementsByTagName("sourceConnections");
					            
					            for(int j=0;j<chileNodes.getLength();j++){
					            	Element n2=(Element)chileNodes.item(j);
					            	System.out.println("*****************"+hashmap2.get(n2.getAttribute("target")));
					            	if(hashmap2.get(n2.getAttribute("target"))==null||!hashmap2.get(n2.getAttribute("target")).equals("environment")){
					            		xml.appendChild(node);
					            		Element instance = document.createElement("instance");
					            		String tmp=(String)hashmap.get(n2.getAttribute("target"));
					            		if(tmp!=null){
					            			Attr instanceName1 = document.createAttribute("name");
					            			instanceName1.setValue((String)hashmap.get(n2.getAttribute("target")));
					            			instance.setAttributeNode(instanceName1);
					            			connections.appendChild(instance);
					            			node.appendChild(connections);
					            		}					            	
					            	}else{
					            		hashmap3.put(n2.getAttribute("target"), n2.getAttribute("source"));
					            		
					            		
					            		
					            	}
					            }
						
					}else{
							
						Element node = document.createElement("environment");  
						Attr AttrName = document.createAttribute("name");              
						AttrName.setValue(n.getAttribute("name"));
						
						node.setAttributeNode(AttrName); 
			            xml.appendChild(node);
			            
			            NodeList chileNodes = n.getElementsByTagName("sourceConnections");
			            if(hashmap3.get(n.getAttribute("name"))!=null){
			            	Element instance2 = document.createElement((String)hashmap2.get(hashmap3.get(n.getAttribute("name"))));
			            	Attr attrTmp=document.createAttribute("name");
			            	attrTmp.setValue(hashmap3.get(n.getAttribute("name")));
			            	instance2.setAttributeNode(attrTmp);
			            	Element connections = document.createElement("connections");
			            	Pair p1=list.get(0);
			            	System.out.println(p1.getH());
			            	for(Pair p : list){			            	
			            		if(p.getH().equals(hashmap3.get(n.getAttribute("name")))){
			            			Element instance3 = document.createElement("instance");
			            			Attr attrTmp2 = document.createAttribute("name");
			            			attrTmp2.setValue((String)hashmap.get(p.getR()));
			            			instance3.setAttributeNode(attrTmp2);
			            			connections.appendChild(instance3);
			            		}
			            	}         	
                            instance2.appendChild(connections);			            	
			            	node.appendChild(instance2);
			            	
			            }
			            
			            for(int j=0;j<chileNodes.getLength();j++){
			            	Element n2=(Element)chileNodes.item(j);
			            	Element instance2 = document.createElement((String)hashmap2.get(n2.getAttribute("target")));
			            	Attr attrTmp=document.createAttribute("name");
			            	attrTmp.setValue((String)hashmap.get(n2.getAttribute("target")));
			            	instance2.setAttributeNode(attrTmp);
			            	
			            	Element connections = document.createElement("connections");
			            	Pair p1=list.get(0);
			            	System.out.println(p1.getH());
			            	for(Pair p : list){			            	
			            		if(p.getH().equals(n2.getAttribute("target"))){
			            			Element instance3 = document.createElement("instance");
			            			Attr attrTmp2 = document.createAttribute("name");
			            			attrTmp2.setValue((String)hashmap.get(p.getR()));
			            			instance3.setAttributeNode(attrTmp2);
			            			connections.appendChild(instance3);
			            		}
			            	}         	
                            instance2.appendChild(connections);			            	
			            	node.appendChild(instance2);			            	
			            }
						
					}
				}
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                
            
        /*3 write to xml */
        TransformerFactory tf = TransformerFactory.newInstance();  
        try {  
            Transformer transformer = tf.newTransformer();  
            DOMSource source = new DOMSource(document);  
            transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");  
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");  
            PrintWriter pw = new PrintWriter(new FileOutputStream("c:/test.xcprovml"));  
            StreamResult result = new StreamResult(pw);  
            transformer.transform(source, result);     
            System.out.println("create XML done!");  
        } catch (TransformerConfigurationException e) {  
            System.out.println(e.getMessage());  
        } catch (IllegalArgumentException e) {  
            System.out.println(e.getMessage());  
        } catch (FileNotFoundException e) {  
            System.out.println(e.getMessage());  
        } catch (TransformerException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
    public static void parserXml(String fileName) {  
        try {  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
            DocumentBuilder db = dbf.newDocumentBuilder();  
            Document document = db.parse(fileName);  
               
            NodeList employees = document.getChildNodes();
            System.out.println(employees.item(0).getNodeName());
            for (int i = 0; i < employees.getLength(); i++) {  
                Node employee = employees.item(i);  
                NodeList employeeInfo = employee.getChildNodes();  
                for (int j = 0; j < employeeInfo.getLength(); j++) {  
                    Node node = employeeInfo.item(j);  
                    NodeList employeeMeta = node.getChildNodes();  
                    for (int k = 0; k < employeeMeta.getLength(); k++) {  
                        System.out.println(employeeMeta.item(k).getNodeName()  
                                + ":" + employeeMeta.item(k).getTextContent());  
                    }  
                }  
            }  
            System.out.println("Done");  
        } catch (FileNotFoundException e) {  
            System.out.println(e.getMessage());  
        } catch (ParserConfigurationException e) {  
            System.out.println(e.getMessage());  
        } catch (SAXException e) {  
            System.out.println(e.getMessage());  
        } catch (IOException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
    	
 

}
