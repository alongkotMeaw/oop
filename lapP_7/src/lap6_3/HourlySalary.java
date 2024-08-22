package lap6_3;

public class HourlySalary extends Employees {
	private double pay;
	private double hours;
	public HourlySalary(String name,String lastname,String ssn,double pay,double hours) {
		super(name,lastname,ssn);
		this.pay = pay;
		this.hours = hours;
	}
	
	public String toString() { 
		return "HourlySalary Employee " + super.toString();  
	} 
	
	public double earnings() {
		return pay*hours;
	};


}
