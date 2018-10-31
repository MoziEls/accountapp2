package qa.com.accountapp2;

public class Account {

	String firstName;
	String lastName;
	String accountNumber;

	public Account ( String getfirstName, String getlastName, String getaccountNumber ) {
		firstName = getfirstName;
	   lastName = getlastName;
	    accountNumber = getaccountNumber;
	    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Accounapp2 [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ "]";
	}
}
		
		
		
	

	
	
	
	

