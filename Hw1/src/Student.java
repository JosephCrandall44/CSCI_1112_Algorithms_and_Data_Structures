//import
import java.util.*;
import java.util.Scanner; 


public class Student {

    //state
	private String Name;
	private String SSN;
	private String Email;
    
	//constructor
	public Student(String Name, String SSN, String Email){
		
		this.Name = Name;
		this.SSN = SSN;
		this.Email= Email;
		
	}
	@Override
	   public String toString() {
	        return ("StudentName: "+this.getName()+
	                    " SSN: "+ this.getSSN() +
	                    " Email: "+ this.getEmail());
	   }
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
}