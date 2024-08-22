package lap_7_2;

import lap6_3.FixedSalary;

public class SavingAccount extends BaseAccount{
	private FixedSalary Em_sa;
	private Double amount;
	private String name;
	public SavingAccount(FixedSalary add) {
        this.Em_sa = add;
	}
	
	//withdraw
	 public boolean withdraw(double amount) {
			if(this.amount >= amount) {
			    this.amount = this.amount - amount;
				return true;
			}
			else {
				return false;
			}
				
			
	}
	 
	//deposit
	  public boolean deposit(double amount) {
		this.amount = this.amount + amount;
		return true;
	}
	public String type() {
		return "AA";
	}
	public double discount() {
		return 1.0;
	}
	

}
