package th.ac.ku.kps.eng.cpe.oop.lab7_2;

public abstract class Employee {

	protected String firstName;
	protected String lastName;
	protected String securityNumber;
	protected SavingsAccount account;

	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		securityNumber = ssn;
	 }

	public String toString() {

	return String.format("%s %s\nsocial security number: %s",
	        firstName, lastName, securityNumber);

	 }
	public abstract double earnings();


	public String getSecurityNumber() {
		return securityNumber;
	}


	public SavingsAccount getAccount() {
		return account;
	}

	public void setAccount(SavingsAccount account) {
		this.account = account;
	}
	public Card getCard() {
		return account.getCard();
	}
}
