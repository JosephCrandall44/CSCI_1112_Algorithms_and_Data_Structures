import java.util.*;

public class Bank {

	Scanner scan = new Scanner(System.in);
	protected String bankName;
	// ArrayList <Account> currentAccount = new ArrayList<Account>();
	ArrayList<Account> account = new ArrayList<Account>();

	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public void openSavingsAccount(double e) {
		int d = account.size() + 10000;
		Account temp = new SavingsAccount(d, e);
	}

	public void openSavingsAccount(double e, int i) {
		int d = account.size() + 10000;
		System.out.print("Enter the account balance");
		double bal = scan.nextDouble();
		Account temp = new Account(d, bal);
	}

	public void closeSavingsAccount() {
		System.out.println("What is the account number");
		int delete = scan.nextInt();
		for (int j = 0; j < account.size(); j++) {
			if (delete == account.get(j).accountNum) {
				System.out.println(account.get(j) + "Has been Removed");
				account.remove(j);
			}
		}
	}

	public void update(int AccountNum) {
		for (int j = 0; j < account.size(); j++) {
			Account temp = account.get(j);
			if (temp instanceof SavingsAccount) {
				((SavingsAccount) temp).interest();
			}
			if (temp instanceof CurrentAccount) {
				((CurrentAccount) temp).overdraft();
			}
		}
	}

	public Account getAccount(int AccountNum) {
		System.out.println("What is the account number");
		int check = scan.nextInt();
		for (int j = 0; j < account.size(); j++) {
			if (check == (account.get(j).accountNum)) {

				return account.get(j);

			}
		}
		return null;
	}

	public void openCurrentAccount(int i) {
		int d = account.size() + 10000;
		Account temp = new Account(d);
	}

	public void openCurrentAccount(int i, double j) {
		int d = account.size() + 10000;
		System.out.print("Enter the account balance");
		double bal = scan.nextDouble();
		Account temp = new Account(d, bal);
	}

	public void closeCurrentAccount(int i, double j) {
		System.out.println("What is the account number");
		int e_delete = scan.nextInt();
		for (int j1 = 0; j1 < account.size(); j1++) {
			if (e_delete == account.get(j1).getAccountNum()) {
				System.out.println(account.get(j1) + "Has been Removed");
				account.remove(j1);
			}
		}
	}
}
