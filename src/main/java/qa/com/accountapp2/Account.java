package qa.com.accountapp2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(length=25)
	String firstName;
	@Column(length=25)
	String lastName;
	@Column(length=6)
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
		
		
		
	

	
	
	
	

