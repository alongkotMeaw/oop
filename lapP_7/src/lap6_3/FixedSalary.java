package lap6_3;

public class FixedSalary extends Employees {

	protected double salary;

	
	public FixedSalary(String name,String lastname,String ssn,double salary) {
		super(name,lastname,ssn);
		this.salary = salary;
	}

	public String toString() { 
		return "FixedSalary Employee" + super.toString();  
	} 
	
	public double earnings() {
		return salary;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
