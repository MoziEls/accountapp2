package qa.com.accountapp2;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	
	@test 
	public void test() {
		
		AccountService account = new AccountService();
		Account account2 = new Account("mozi","els","12397");
		Account account3 = new Account("tom","els","46456");
		Account account4 = new Account("alex","jhon","54641");
		account.addAccount(account2);
		account.addAccount(account3);
		account.addAccount(account4);
		account.addAccount(account4);
		
		
		
		aserEquals(1,account.getAccountsum(account2));
		aserEquals(1,account.getAccountsum(account3));
		aserEquals(1,account.getAccountsum(account4));
		
		
		
		
		
	}
	
	
	

}
