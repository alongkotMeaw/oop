package lap6_3;

public class CommissionPay extends Employees{
	private double sale;
	private double rate;
	public CommissionPay(String name,String lastname,String ssn,double sale,double rate) {
		super(name,lastname,ssn);
		this.rate = rate;
		this.sale = sale;
	}
	
	public String toString() { 
		return "CommissionPay Employee " + super.toString();  
	} 
	
	public double earnings() {
		return sale*rate;
	};

}
