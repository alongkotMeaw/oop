package th.ac.ku.kps.eng.cpe.oop.lab7_2;

public class FixedSalary extends Employee {
	private double salary;

	public FixedSalary(String first, String last, String ssn,double salary) {
	super(first, last, ssn);
	this.salary = salary;
	}
	public  double earnings() {
	return salary;
	}
	@Override
	public String toString() {
	return "Fixed Salary empolyee: "+super.toString()+"\n"+"social security number : $"+salary;
	}
	
}
