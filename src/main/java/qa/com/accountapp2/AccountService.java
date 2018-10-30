package qa.com.accountapp2;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;


public class AccountService {
	static Map<String, Integer> accounMap = new HashMap<String, Integer>();
	String name;
 
   

public void addAccount (Account acc ) {
	name = acc.getFirstName() + acc.getLastName();
	accounMap.put(name, acc.getAccountNumber());
	
}

public Map<String, Integer> viewMap() {
	return accounMap;
}
public String ConvertOjSON( Map<String, Integer> myMap) throws JsonProcessingException{
	   ObjectMapper object =new  ObjectMapper();
	   return object.writeValueAsString(myMap);
}

}