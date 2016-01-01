public class SavingsAccount extends Account {

	private double interest = .05;

	public SavingsAccount(int accountNum, double interest) {
		super(accountNum);
		this.interest = interest;
	}

	public SavingsAccount(int accountNum, double bal, double interst) {
		super(accountNum, bal);
		this.interest = interest;
	}

	public void interest() {
		bal = bal * (interest) + bal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
