public class  Account {
	
	protected double bal; 
	protected int accountNum; 


	// constructor, initialize balance to 0
	public Account(int a)
	{    
		accountNum = a;
		bal= 0.0;
	}
	
	public  Account (int a, double b){
		
		accountNum = a;
		bal = b;
	}

	public void deposit(double sum)
	{
		if (sum>0){
			bal+=sum;    
			System.out.println("Deposit Successful ..");
		}else
			System.err.println("cannot deposit negative amount.");    
	}

	public void withdraw(double sum)
	{
		if (sum>0){
			bal-=sum;  
			System.out.println("Withdrawl Successful ..");
		}else
			System.err.println("Cannot withdraw negative amount.");    
	}

	public double getBalance()
	{
		return bal;
	}

	public double getAccountNumber()
	{
		return accountNum;
	}

	public String print()
	{
		return "Account " + accountNum + ": " + "balance = " + bal;    
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

}