package pl.piotrdawidziuk.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
    	  
        JSONParser parser = new JSONParser();
        
        
        //   https://stackoverflow.com/questions/18440098/org-json-simple-jsonarray-cannot-be-cast-to-org-json-simple-jsonobject
        
        // https://stackoverflow.com/questions/10926353/how-to-read-json-file-into-java-with-simple-json-library
    	
    	try {
			JSONArray a = (JSONArray) parser.parse(new FileReader("books.json"));
			 for (Object o : a)
			  {
			    JSONObject book = (JSONObject) o;

			    String id = (String) book.get("id");
			    System.out.println(id);

			    String kind = (String) book.get("kind");
			    System.out.println(kind);

			    String etag = (String) book.get("etag");
			    System.out.println(etag);

			    //JSONArray cars = (JSONArray) person.get("ss");
//
//			    for (Object c : cars)
//			    {
//			      System.out.println(c+"");
//			    }
			  }
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
