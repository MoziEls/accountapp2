package qa.com.accountapp2;

public class Account {

	String firstName;
	String lastName;
	int accountNumber;

	public Account ( String getfirstName, String getlastName, int getaccountNumber ) {
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

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Accounapp2 [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ "]";
	}
}
		
		
		
	

	
	
	
	

