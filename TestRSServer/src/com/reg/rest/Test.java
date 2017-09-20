package com.reg.rest;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  

@Path("/myfirst")  
public class Test {
	
	  // This method is called if HTML and XML is not requested  
	  @GET  
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String getPlainTextMsg() {  
	    return "Hello Jersey Plain";  
	  }  
	  // This method is called if XML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_XML)  
	  public String getXMLMsg() {  
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
	  }  
	  
	  // This method is called if HTML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String getHtmlMsg() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  } 
	  
	// This method is called if JSON is requested
	    @GET
	    @Produces({MediaType.APPLICATION_JSON})
	    public String getJSONMsg() {
	    	return "Hello Jersey JSON"; 
	        //return todo;
	    }
	    
	}   