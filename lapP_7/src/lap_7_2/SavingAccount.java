package lap_7_2;

<<<<<<< HEAD
import lap6_3.Employees;
=======
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
import lap6_3.FixedSalary;

public class SavingAccount extends BaseAccount{
	private FixedSalary Em_sa;
<<<<<<< HEAD
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
=======
	private Double amount;
	private String name;
	public SavingAccount(FixedSalary add) {
        this.Em_sa = add;
	}
	
	//withdraw
	 public boolean withdraw(double amount) {
			if(this.amount >= amount) {
			    this.amount = this.amount - amount;
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
				return true;
			}
			else {
				return false;
			}
				
			
	}
	 
<<<<<<< HEAD
	
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
=======
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
>>>>>>> bf50ca6191d72ed56c530679c376838a047a9657
	

}
