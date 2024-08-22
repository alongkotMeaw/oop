package lap6_3;

public abstract class Employees { 
	protected String firstName; 
	protected String lastName; 
	protected String securityNumber; 
	//constructor
	public Employees(String first, String last, String ssn) { 
		firstName = first; 
		lastName = last; 
		securityNumber = ssn; 
	}
	
	public String toString() { 
		return String.format("%s %s\nsocial security number: %s",firstName, lastName, securityNumber); 
	} 
	
	public abstract double earnings(); 
}
