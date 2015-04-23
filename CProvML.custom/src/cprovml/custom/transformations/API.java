package cprovml.custom.transformations;

public class API {
	private String host="http://example.com";
	private String name;
	private String uri;
	private String method = "GET";
	private String body;
	public API(String name,String uri,String method,String body){
		this.name=name;
		this.uri=uri;
		this.method=method;
		this.body=body;	
	}
	public String toString(){
		String tmp=null;
		tmp="Host:"+host+"\n"
		   +"Request Method:"+method+"\n"
		   +"Request URI"+uri+"\n"
		   +"Request Body:"+body+"\n"
		   +"URL:"+host+uri;
		
		return tmp;
	}
	

}