package qa.com.accountapp2;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;


public class AccountService {
	static Map<String, Account> accounMap = new HashMap<String, Account>();
	String name;
	
	
	public int accountCycle (String account2 ){
	
		int count = 0;
		for (Account str : accounMap.values()) {
		    if(str.firstName.equals(account2)) {
		    	count++;
		    }
	}
		
		return count;
	}
	public int Streams (String firstName ) {
		return (int) accounMap.values().stream().filter(i -> i.getFirstName().equals(firstName)).count();
		 
	}
   
	

public void addAccount (Account acc ) {
	name = acc.getFirstName() + acc.getLastName();
	accounMap.put(name,acc);
	
}

public Map<String, Account> viewMap() {
	return accounMap;
}
public String ConvertOjSON( Map<String, String> myMap) throws JsonProcessingException{
	   ObjectMapper object =new  ObjectMapper();
	   return object.writeValueAsString(myMap);
}



}