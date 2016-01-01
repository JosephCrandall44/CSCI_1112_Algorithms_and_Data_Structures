public class CurrentAccount extends Account {

	private double overdraftLimit = 50;

	public CurrentAccount(int accountNum, double overdraftLimit) {

		super(accountNum);
		this.overdraftLimit = overdraftLimit;
	}

	public CurrentAccount(int accountNum, double bal, double overDrafLimit) {
		super(accountNum, bal);
		this.overdraftLimit = overdraftLimit;

	}

	public void overdraft() {

		if (bal < -overdraftLimit) {
			System.out.println("You have exceedee your overdraft limit");
		} else
			super.withdraw(bal);
	}

}
