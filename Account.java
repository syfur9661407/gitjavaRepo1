package account;

public class Account {
	String accountName;
	long accountPhone;
	String accountAddress;
	float amount;
	double blance;
	Account(String accountName, long accountPhone, String accountAddress){
		
		this.accountName= accountName;
		this.accountPhone= accountPhone;
		this.accountAddress= accountAddress;
			 
	}//constructor
	
public void deposit(float amount) {
	this.amount=amount;
	
}
	
	public void withdraw(float amount) {
	this.amount=amount;
	
	}
  
	double showblance (double blance) 
 {
		
		this.blance=blance;
		return blance;
		
	}  
	
}//class
