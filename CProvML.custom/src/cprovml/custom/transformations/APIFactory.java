package cprovml.custom.transformations;

import java.io.FileNotFoundException;  

import java.io.FileWriter;
import java.io.IOException;  

import java.util.HashMap;


import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
 
    
import org.w3c.dom.Document;  
import org.w3c.dom.Element;  
import org.w3c.dom.Node;  
import org.w3c.dom.NodeList;  
import org.xml.sax.SAXException;  


public class APIFactory {
   
    public static void toTXT(String fileName, String outputFile) {
    	try {
    		    HashMap <String, String> hashmap = new HashMap();
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
	            DocumentBuilder db;
				db = dbf.newDocumentBuilder();
				Document document = db.parse(fileName);
				Element CProvML = document.getDocumentElement();			
				
				/*environment*/
				System.out.println("prcocess environment");
				//build relationship
				NodeList environments = CProvML.getElementsByTagName("environment");
				for(int i=0;i<environments.getLength();i++){
					Element environment=(Element)environments.item(i);
					String environmentName=environment.getAttribute("name");
					
					
					NodeList childNodes = environment.getChildNodes();
					System.out.println(childNodes.getLength());
					if(childNodes.getLength()!=0){
						for(int z=1;z<childNodes.getLength();z+=2){
							Element e = (Element)childNodes.item(z);
							
							
							System.out.println("put key:"+e.getAttribute("name")+" value:"+environmentName);
							String tmp = hashmap.get(e.getAttribute("name"));
							if(tmp!=null){
							    tmp=tmp+"&"+environmentName;
								hashmap.put(e.getAttribute("name"), tmp);
							}else{
								hashmap.put(e.getAttribute("name"), environmentName);
							}
							System.out.println(e.getAttribute("name"));
							System.out.println(childNodes.item(z).getNodeName());
						}
					}
				}
				
				for(int i=0;i<environments.getLength();i++){
					Element environment=(Element)environments.item(i);
					String environmentName=environment.getAttribute("name");
					API envr = new API(environmentName,"/"+environmentName+"/?action=create","POST","");
					writeFile("//Create environment", envr, outputFile);
					
					NodeList childNodes = environment.getChildNodes();
					System.out.println(childNodes.getLength());
					if(childNodes.getLength()!=0){
						for(int z=1;z<childNodes.getLength();z+=2){
							Element e = (Element)childNodes.item(z);
							String name = e.getAttribute("name");
							String type = e.getNodeName();
							NodeList e1 = e.getElementsByTagName("connections");
							String connections=null;
							if(e1.getLength()!=0){
								Element e11 = (Element) e1.item(0);
								NodeList n1 = e11.getChildNodes();
								if(n1.getLength()!=0){
									for(int y=1;y<n1.getLength();y+=2){
										Element e12=(Element)n1.item(y);
										if(connections==null){
											connections=e12.getAttribute("name");
										}else{
											connections=connections+"&"+e12.getAttribute("name");	
										}
									}
									
								}
							
							}
							String body;
							System.out.println(hashmap.get(name));
							if(hashmap.get(name)!=null){
								body = "environment="+hashmap.get(name)+" connections="+connections;
							}else{
								body = "connections="+connections;
							}
							API apiCreate = new API(name,"/"+name+"/?action=create","POST",body);
							API apiRun = new API(name,"/"+name+"/?action=run","POST",body);
							
							writeFile("//Create "+type,apiCreate,outputFile);
							writeFile("//Run "+type,apiCreate,outputFile);
							
							System.out.println(apiCreate.toString());
							
							
						}
					}
				}
System.out.println("##############################################");
				/*instance*/
				System.out.println("process instance");
				NodeList c = CProvML.getChildNodes();
				System.out.println(c.getLength());
				if(c.getLength()!=0){
				for(int k=1;k<c.getLength();k+=2){
					if(!c.item(k).getNodeName().equals("environment")){
						Element e = (Element)c.item(k);
						String name = e.getAttribute("name");
						String type = e.getNodeName();
						NodeList e1 = e.getElementsByTagName("connections");
						String connections=null;
						if(e1.getLength()!=0){
							Element e11 = (Element) e1.item(0);
							NodeList n1 = e11.getChildNodes();
							if(n1.getLength()!=0){
								for(int y=1;y<n1.getLength();y+=2){
									Element e12=(Element)n1.item(y);
									if(connections==null){
										connections=e12.getAttribute("name");
									}else{
										connections=connections+"&"+e12.getAttribute("name");	
									}
								}
								
							}
						
						}
						String body;
						System.out.println(hashmap.get(name));
						if(hashmap.get(name)!=null){
							
							body = "environment="+hashmap.get(name)+" connections="+connections;
						}else{
							body = "connections="+connections;
						}
						API apiCreate = new API(name,"/"+name+"/?action=create","POST",body);
						API apiRun = new API(name,"/"+name+"/?action=run","POST",body);

						System.out.println(apiCreate.toString());
						writeFile("//Create "+type,apiCreate,outputFile);
						writeFile("//Run "+type,apiCreate,outputFile);

					}
				}}
			
			
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
            
        /*3 write to txt file*/
		
         
    }  
    public static void writeFile(String annotation, API api, String fileName){
    	FileWriter writer;
		try {
			writer = new FileWriter(fileName, true);
			writer.write(annotation+"\n");//first line
	    	writer.write(api.toString());
	    	writer.write("\n");
	    	writer.write("\n");
	    	writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
