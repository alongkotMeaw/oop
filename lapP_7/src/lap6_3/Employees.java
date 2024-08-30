package lap6_3;


import lap_7_2.Card;
import lap_7_2.DebitCard;
import lap_7_2.SavingAccount;

public abstract class Employees extends Card{
	protected String firstName; 
	protected String lastName; 
	protected String securityNumber; 
	protected double discount;
	protected SavingAccount account;
	private  Card card = new DebitCard(account);
	//constructor
	public Employees(String first, String last, String ssn) { 
		firstName = first; 
		lastName = last; 

		securityNumber = ssn;
	}
    
	public double discount(){
		return discount;
	}
	
	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}


		//securityNumber = ssn; 
	
	
	public String toString() { 
		return String.format("%s %s\nsocial security number: %s",firstName, lastName, securityNumber); 
	} 
	

	public Card getCard() {
		return card;
	}
	public Employees reEmployees() {
		return this;
	}
	

	public abstract double earnings(); 
}
