package lap_7_2;

import lap6_3.Employees;
import lap6_3.FixedSalary;

public class SavingAccount extends BaseAccount {
	private FixedSalary Em_sa;
	private Employees emp;
	Card card;

	public SavingAccount(FixedSalary add) {
		this.Em_sa = add;
		card = new DebitCard(this);

	}

	// withdraw
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

	/// **************************************///

	public double discount() {
		return 1.0;
	}

	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
//inner class
	public class DebitCard extends Card {
		private String type = "Visa";
		private SavingAccount acout;
		protected double discount = 2.5;
		private String secnum;

		public DebitCard(SavingAccount a) {
			this.acout = a;

		}

		public String type() {
			return type;
		}

		public double discount() {
			return discount;
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

}
