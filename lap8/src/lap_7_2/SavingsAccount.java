package lap_7_2;
public class SavingsAccount extends BaseAccount{
	
	private Employee exp;
	private Card card;
	private double amount = 0;

	public SavingsAccount(Employee exp) {
		this.exp = exp;
		card = new DebitCard(this);
		exp.setAccount(this);
	}
    //
	///
	public boolean withdraw(double amount) {
		if(amount <= this.amount) {
			this.amount -= amount;
			return true;
		}
		return false;
	}
	public boolean deposit(double amount) {
		this.amount += amount;
		return true;
	}
	public Employee getEmployee() {
		return exp;
	}
	public Card getCard() {
		return card;
	}

	public double getAmount() {
		return amount;
	}
	
	
	public class DebitCard extends Card{

		private SavingsAccount account;


		public DebitCard(SavingsAccount account) {
			this.account = account;
		}

		@Override
		public boolean withdraw(double amount) {
			return account.withdraw(amount);
		}

		@Override
		public String type() {
			return "visa";
		}

		@Override
		public double discount() {
			return 2.5;
		}

		public SavingsAccount getAccount() {
			return account;
		}
	}
}
