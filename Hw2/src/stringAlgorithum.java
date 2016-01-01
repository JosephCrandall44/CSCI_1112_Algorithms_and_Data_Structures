import java.util.*;
public class stringAlgorithum {
	
	public static boolean checkReversed(int[] x, int[] y)
	{
	    // For production code, possibly add nullity checks here (see comments)
	    if (x.length != y.length)
	    {
	        return false;
	    }
	    // Loop through x forwards and y backwards
	    for (int i = 0; i < x.length; i++)
	    {
	        if (x[i] != y[y.length - 1 - i])
	        {
	            // As soon as we've found a "mistake" we can exit:
	            // This is simpler (IMO) than keeping a "check" variable
	            return false;
	        }
	    }
	    return true;
	}
		
	void checkArray(String sentance){
		
		ArrayList<String> myArray= new ArrayList<String>();
		ArrayList<String> final1 = new ArrayList<String>();
			
		for (String x: sentance.split(" ")) {
			myArray.add(x);
		}
		
		
		for (int i = 0; i < myArray.size();i+=3){
			
			int x = myArray.get(i).length();
			int y = myArray.get(i+1).length();
			int z = myArray.get(i+2).length();
			
			if ( x >= y && x >= z){
				final1.add(myArray.get(i));	
			}
			else if(y > x && y >= z){
				final1.add(myArray.get(i+1));	
			}
			else if(z > x && z > y){
				final1.add(myArray.get(i+2));		
			}
			
			}
		}	System.out.println(final1);
	}


