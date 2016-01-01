import java.util.Scanner;


public class Lab3 {

	public static void main(String[] args) {
		IntegerArray a=new IntegerArray(10);
		a.sequentialValues();
		System.out.println("sequential values:");
		a.printElements();
		System.out.println("sequential values printed backwards:");
		a.printBackwards();
		a.alternatingValues();
		System.out.println("alternating values:");
		a.printElements();
		a.randomValues();
		System.out.println("random values:");
		a.printElements();
		System.out.println("sum of random values:");
		System.out.println(a.sumArray());
		
		//testing frequencies method
		IntegerArray b=new IntegerArray(100);
		b.randomValues();
		b.frequencies();
		
		//testing search methods
		b.sequentialValues();
		System.out.println("sequemtial search for element 88, index =" +b.binarySearch(88));
		System.out.println("binary search for element 88, index =" +b.binarySearch(88));
		
		//testing recursive binary search
		 System.out.println("recursive binary search for element 88, index =" +b.recursiveBinarySearch(0,100, 88));
	        
		
		//testing run time
		
		IntegerArray c=new IntegerArray(1000);
		c.sequentialValues();
		
		
		long startTime = System.currentTimeMillis ();
		c.sequentialSearch(999);
		long endTime = System.currentTimeMillis ();          
        // Time taken in milliseonds
        long timeTaken = endTime - startTime;
        System.out.println("sequential search time in ms : " + timeTaken);
        
        startTime = System.currentTimeMillis ();
		c.binarySearch(999);
		endTime = System.currentTimeMillis ();          
        timeTaken = endTime - startTime;
        System.out.println("binary search time in ms : " + timeTaken);
      
       
        //Bonus - 2
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Think of a number between 1 and 100");
    	int low=1;
		int high=100;		
		while(low<=high){
			if (low==high){
				System.out.println("number is " + low);
				break;
			}
			int mid=(low+high)/2;
			System.out.println("is the number greater than " + mid);
			switch (scan.nextLine().toLowerCase().charAt(0)){
			case 'y':
				low=mid+1;
				break;
			case 'n':
				System.out.println("is the number less than " + mid);
				switch (scan.nextLine().toLowerCase().charAt(0)){
				case 'y':
					high=mid-1;
					break;
				case 'n':
					System.out.println("number is "+mid);
				}
				break;
			}
			
		}

	}

	

}
