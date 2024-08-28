package lap6_3;

public class FixedSalary extends Employees {
<<<<<<< HEAD
	protected double salary;
=======
	private double salary;
	
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	public FixedSalary(String name,String lastname,String ssn,double salary) {
		super(name,lastname,ssn);
		this.salary = salary;
	}
<<<<<<< HEAD
	
	
	
=======
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	public String toString() { 
		return "FixedSalary Employee" + super.toString();  
	} 
	
	public double earnings() {
		return salary;
<<<<<<< HEAD
	}
	



	
=======
	};
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657

}
