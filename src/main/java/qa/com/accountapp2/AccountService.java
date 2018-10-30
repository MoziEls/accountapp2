package qa.com.accountapp2;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
	Map<String, Integer> accounMap = new HashMap<String, Integer>();
	String name;
	

public void addAccount (Account acc ) {
	name = acc.getFirstName() + acc.getLastName();
	accounMap.put(name, acc.getAccountNumber());
	
}

public Map<String, Integer> viewMap() {
	return accounMap;
}
}
