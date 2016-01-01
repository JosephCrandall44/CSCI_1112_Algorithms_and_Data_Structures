import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Lab2 {
	
	public static void main (String[] args){
		//create Bank objects
		Bank bank1=new Bank("Worst Bank");
		Bank bank2=new Bank("Best Bank");
		
		//create an ATM object
		ATM myATM=new ATM();
		
		//add banks to ATM
		myATM.addBank(bank1);
		myATM.addBank(bank2);
		
		//open accounts in bank1
		bank1.openSavingsAccount(0.01); //parameter is interest rate 
		bank1.openSavingsAccount(0.02, 3700); // first argument is the interest rate, second is the starting balance
		bank1.openCurrentAccount(100, 2500); // first parameter is the overdraft limit, second is the starting balance
		bank1.openCurrentAccount(150); // parameter is overdraft limit
		
		//open accounts in bank2
		bank2.openSavingsAccount(0.1);
		bank2.openSavingsAccount(0.15, 2000);
		bank2.openSavingsAccount(1, 500);
		bank2.openCurrentAccount(1000, 20000);
		bank2.openCurrentAccount(1500, 1000);
		bank2.openCurrentAccount(2000);
		
		// print all ACCOUNTS
		System.out.println(bank1.getName()+" : ");
		bank1.printAllAccounts();
		
		System.out.println(bank2.getName()+" : ");
		bank2.printAllAccounts();
		
		
		//user prompts 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
		while(true){
			System.out.println("Select Option");
			System.out.println("1 - ATM");
			System.out.println("2 - Print Status");
			int selection;
			try{
				selection=Integer.parseInt(in.readLine());
			}catch(Exception ex){
				System.out.println("invalid input, try again");
				CONTINUE;
			}
			
			if (selection == 1)
				myATM.run();
			else
				break;
		}
		
		// update BANK ACCOUNTS
		bank1.updateAccounts();
		bank2.updateAccounts();
		
		
		// print bank accounts
		System.out.println(bank1.getName()+" : ");
		bank1.printAllAccounts();
		System.out.println(bank2.getName()+" : ");
		bank2.printAllAccounts();
	
	}

}