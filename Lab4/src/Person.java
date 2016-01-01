
public class Person implements Comparable<Person>{

	private String firstName;
	private String lastName;
	private int score;
	
	//constructor
	public Person(String f, String l, int s){
		firstName=f;
		lastName=l;
		score=s;
		
	}
	public String toString(){
		return firstName+" "+lastName+"\t"+score;
	}
	
	@Override
	public int compareTo(Person o) {
		if (score == o.score) return 0;
		else if (score < o.score) return -1;
		else return 1;
	}


}
