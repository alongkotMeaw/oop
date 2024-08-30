package th.ac.ku.kps.eng.cpe.oop.lab7_2;

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
