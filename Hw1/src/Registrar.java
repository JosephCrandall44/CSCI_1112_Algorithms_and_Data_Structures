//this class is about has the main method
import java.util.ArrayList;
//this is the main application that uses both CDstoreManager and CD classes
//this class is incomplete and I encourage you to finish it and add a do-while with a menu 
//or switch depending on what the store manager wants to do ..
//this related to the project, and also it is a good review for the final exam. 
import java.util.Scanner;



public class Registrar {
final static int PASSWORD = 12345;



	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList <Student> Student1 = new ArrayList<Student>();
		int count = 0;
		int option;
      

    	   System.out.println("Hello. Welcome to My Admin."); 
    		
    	  do { 
    		
    		System.out.println("Please enter your numerical Password."); 
    		int x = scan.nextInt();
    			
    			
    		if (x == PASSWORD) {
    			
    			do {
    			System.out.println("Welcome to My Admin."); 
    			System.out.println("Choose an option.");
    			System.out.println("1. Search a Student.");
    			System.out.println("2. Add a Student.");
    			System.out.println("3. Delete a Student.");
    			System.out.println("4. Display all students.");
    			System.out.println("5. Exit - close the applciaiton");
    			option = scan.nextInt(); 
    			switch (option) {
    			
    			case 1:
    				System.out.println("What is the name of the person you are searching for?");
    				String e_temporary = scan.next();
    				String temp;
    				Student temp2;
    				
    				for (int j = 0; j < Student1.size(); j++) {
    					temp2 = Student1.get(j);
    					temp = temp2.getName();

    					if (e_temporary.equals(temp)) {
    						System.out.println("Found " + Student1.get(j).getName());
    					}
    				}
    				try {
    				    Thread.sleep(2000);
    				} catch(InterruptedException ex) {
    				    Thread.currentThread().interrupt();
    				}
    				break;
    			
    			case 2:
    				
    				
    				System.out.println("Add a Student Name");
    				String Name = scan.next(); 
    				
    				System.out.println("Add a Student SSN");
    				String SSN = scan.next(); 
    				
    				System.out.println("Add a Student Email");
    				String Email = scan.next(); 
    				
    				Student temp1 = new Student(Name, SSN, Email);
    				Student1.add(temp1);
    			  	System.out.println("The Student has been added"); 
    				break;
    				
    				
    			case 3:
    				System.out.println("What is the name of the person you want to delete?");
    				String e_delete = scan.next();
    				String temp3;
    				
    				for (int j = 0; j < Student1.size(); j++) {
    					temp3 = Student1.get(j).getName();
    					if (e_delete.equals(temp3)) {
    						System.out.println(Student1.get(j).getName() + "Has been Removed");
    						Student1.remove(j);
    					}
    				}
    				break;
    				
    				
    			case 4:
    				System.out.println(Student1);
    				break;
    			}
    			
    			}while (option != 5);
    			
    			
    			
    			System.out.println("Have a nice day");
    			
    			
    			
    			
    		
    	} else {System.out.println("Invalid Password."); 
				count++;}
    			
    			
    			
    			
    		
    			
    	} while (count <3);
    	System.out.println("Sorry, you ran out of tries.");	
    }			
}


