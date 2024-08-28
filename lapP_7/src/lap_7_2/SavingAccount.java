package lap_7_2;

import lap6_3.Employees;
import lap6_3.FixedSalary;

public class SavingAccount extends BaseAccount{
	private FixedSalary Em_sa;
	private Employees emp;
	Card card;

	public SavingAccount(FixedSalary add) {
        this.Em_sa = add;
        card = new DebitCard(this);
        
	}
	//withdraw
	 public boolean withdraw(double amount) {
			if( Em_sa.salary >= amount) {
			     = Em_sa.salary - amount;
				return true;
			}
			else {
				return false;
			}
				
			
	}
	 
	
	public Card getCard() {
		return card;
    }
	  
	public Employees getEmployees() {
		return emp;
	}
	  
	  
	  ///**************************************///
	
	public double discount() {
		return 1.0;
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
