package lap6_3;

<<<<<<< HEAD
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
=======
public abstract class Employees { 
	protected String firstName; 
	protected String lastName; 
	protected String securityNumber; 
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	//constructor
	public Employees(String first, String last, String ssn) { 
		firstName = first; 
		lastName = last; 
<<<<<<< HEAD
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

=======
		securityNumber = ssn; 
	}
	
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	public String toString() { 
		return String.format("%s %s\nsocial security number: %s",firstName, lastName, securityNumber); 
	} 
	
<<<<<<< HEAD
	public Card getCard() {
		return card;
	}
	public Employees reEmployees() {
		return this;
	}
	
=======
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	public abstract double earnings(); 
}
