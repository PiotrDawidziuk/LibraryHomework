package pl.piotrdawidziuk.service;

import org.json.simple.JSONObject;

public class JSONReader {
	
	public static void main(String[] args) {
		
	}
	
	  private static void parseBookObject(JSONObject book)
	    {
	        //Get employee object within list
	        JSONObject bookObject = (JSONObject) book.get("items.");
	         
	        //Get employee first name
	        String firstName = (String) bookObject.get("firstName");   
	        System.out.println(firstName);
	         
	        //Get employee last name
	        String lastName = (String) bookObject.get("lastName"); 
	        System.out.println(lastName);
	         
	        //Get employee website name
	        String website = (String) bookObject.get("website");   
	        System.out.println(website);
	    }

}
