package cprovml.ee;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import CProvML.NodesDiagram;
import cprovml.ee.cloudservicecallsfilter.CPSCallFilter;
import cprovml.ee.cloudservicecallsfilter.MenuHandler;
import cprovml.ee.xcprovmlfilter.XCProvMLFilter;

public class PipelineFacade {

	private static PipelineFacade instance;
	private XCProvMLFilter xcProvMLFilter;
	private CPSCallFilter callsFilter;
	
	protected PipelineFacade()
	{
		xcProvMLFilter = new XCProvMLFilter();
		callsFilter = new CPSCallFilter();
	}
	
	public static PipelineFacade getInstance()
	{
		if(instance == null)
		{
			return instance = new PipelineFacade();
		}
		
		return instance;
	}
	
	public void transformModelToGCProvML(NodesDiagram model)
	{
		throw new NotImplementedException();
	}
	
	public void transformModelToXCProvML(NodesDiagram model)
	{
		throw new NotImplementedException();
	}
	
	public void transformGCProvToXCProv(String xmlFilePath, String outputPath)
	{
		xcProvMLFilter.transformCprovml(xmlFilePath, outputPath);
	}
	
	public void transformXCProvToCloudCalls(String xmlFilePath, String outputPath)
	{
		callsFilter.toTXT(xmlFilePath, outputPath);
	}
}
