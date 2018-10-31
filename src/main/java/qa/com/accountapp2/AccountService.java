package qa.com.accountapp2;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;


public class AccountService {
	static Map<String, String> accounMap = new HashMap<String, String>();
	String name;
	
	
	public String accountCycle (String firstName ){
	
		for (String str : accounMap.values()) {
		    System.out.println(str);
	}
		
		return name;
	}
	public int Streams (String firstName ) {
		return (int) accounMap.values().stream().filter(i -> i.equals(firstName)).count();
		 
	}
   
	

public void addAccount (Account acc ) {
	name = acc.getFirstName() + acc.getLastName();
	accounMap.put(name, acc.getAccountNumber());
	
}

public Map<String, String> viewMap() {
	return accounMap;
}
public String ConvertOjSON( Map<String, String> myMap) throws JsonProcessingException{
	   ObjectMapper object =new  ObjectMapper();
	   return object.writeValueAsString(myMap);
}



}