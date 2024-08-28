package lap_7_2;

public class DebitCard extends Card{
	private String type = "Visa";
	private SavingAccount acout;
	protected double discount = 2.5;
	private String secnum = "5555";	
	public  DebitCard(SavingAccount a) {
		this.acout =a;

	}   
	public String type() {
	    return type;
	}
	public double discount() {
		return  discount;
	}

		
	
	public String securityNumber() {
		return securityNumber();
	}
	@Override
	public boolean withdraw(double amount) {
		
		return true;
	}
	public String getSecnum() {
		return secnum;
	}
	public void setSecnum(String secnum) {
		this.secnum = secnum;
	}

}
