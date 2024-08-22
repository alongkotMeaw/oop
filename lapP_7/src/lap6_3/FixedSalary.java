package lap6_3;

public class FixedSalary extends Employees {
	private double salary;
	
	public FixedSalary(String name,String lastname,String ssn,double salary) {
		super(name,lastname,ssn);
		this.salary = salary;
	}
	public String toString() { 
		return "FixedSalary Employee" + super.toString();  
	} 
	
	public double earnings() {
		return salary;
	};

}
