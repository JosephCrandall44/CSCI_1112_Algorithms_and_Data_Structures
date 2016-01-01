import java.io.PrintStream;


public class Fractals {

	public static void printPattern(int length, char pattern, int indent){
		for (int i=length%2; i<length; i+=2){
			for (int j=0; j<indent+ (length-i)/2; j++)
				System.out.print(" ");
			for (int j=0; j<i; j++)
				System.out.print(pattern);
			System.out.println();
		}
		for (int i=length; i>0; i-=2){
			for (int j=0; j<indent+ (length-i)/2; j++)
				System.out.print(" ");
			for (int j=0; j<i; j++)
				System.out.print(pattern);
			System.out.println();
		}
	}

	static double sumover(int n){
		double sum = 0;
		for(double i = 1; i <= n; i++){
			double value = 1/i;
			sum = sum + value;
		} return sum;
		
	}
	
	static double recursiveSumover(double n)
	{
	   if ( n == 0 )  // base case
	      return 0;
	      return 1/n + recursiveSumover( n  - 1 ); //recursive case
	}
	
	
	
	
	static void recursiveAsterisks (double n){
		
		if ( n == 1 ){  
			// base case
			System.out.println("*");	
		}
		else
		{
			recursiveAsterisks(n - 1); //recursion
			for(int i = 0; i < n; i++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		   // recursiveAsterisks(n - 1); //recursion
		}	
	}
	
	
	static void recursiveAsterisksReverse (double n){
		
		if ( n == 1 ){  
			// base case
			System.out.println("*");	
		}
		else
		{
			for(int i = 0; i < n; i++ )
			{
				System.out.print("*");
			}
			System.out.println("");  
			recursiveAsterisksReverse(n - 1); //recursion
		}
	}
	
	public static void printFractal(int length, char pattern, int indent){
	
		if (length < 4){
			//nothing happens
		}
		else{
		printFractal(length/2, pattern, indent + (length/4));
		printPattern(length, pattern, indent);
		printFractal(length/2, pattern, indent + (length/4));
		}
	}
	
	
	public static int[] pascalTriangle(int n)
	{
	    int[] rowhightofpt = new int[n+1];
	    
	    if(n == 0)
	    {
	    	rowhightofpt[0] = 1;
	    }
	    
	    else{
	    		
	    	int[] arrayLineOfPascalTriangle = pascalTriangle(n-1);
	    	
	    	rowhightofpt[0] = rowhightofpt[n] = 1;
	    	
	    	for(int i = 1; i < arrayLineOfPascalTriangle.length; i++)
	    	{
	    		rowhightofpt[i] = arrayLineOfPascalTriangle[i-1] + arrayLineOfPascalTriangle[i];
	    	}
	    	
	    } for (int i = 0; i< rowhightofpt.length; i++) {System.out.print(rowhightofpt[i] + " ");} System.out.println(""); return rowhightofpt;
	}
		
	
	
	public static void main(String[]args){
		System.out.println(sumover(20));
		System.out.println(recursiveSumover(10));
		recursiveAsterisks(10);
		recursiveAsterisksReverse(10);
		printPattern(64,'$',10);
		printFractal(64,'*',10);
		pascalTriangle(8);
	}
	
}
