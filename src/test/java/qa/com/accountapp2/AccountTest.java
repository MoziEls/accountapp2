package qa.com.accountapp2;

import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	
	@Test 
	public void test() {
		
		AccountService account = new AccountService();
		Account account2 = new Account("mozi","els","12397");
		Account account3 = new Account("tom","els","46456");
		Account account4 = new Account("alex","jhon","54641");
		account.addAccount(account2);
		account.addAccount(account3);
		account.addAccount(account4);
		account.addAccount(account4);
		
		
		
		assertEquals(1,account.Streams("mozi"));
		assertEquals(1,account.accountCycle("tom"));
		assertEquals(1,account.Streams("mozi"));
		
		
		
		
		
	}
	
	
	

}
