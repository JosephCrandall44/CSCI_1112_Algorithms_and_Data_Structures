import java.util.*;
public class recursive {
			
	public static void main(String[]args){
		//int[] array1 = new int[] {5,76,85,36,54,77,66445,56,45,6};
		//findHelper(array1, 0, array1.length);
		
		
		//int[] binary = parseBinaryToIntArray(test);
		
		int x = 34;
		String test = Integer.toBinaryString(x);
		int binaryNumbers = Integer.parseInt(test);
		int value = zeroCount(binaryNumbers);
		System.out.print(value);
	}
	
	public static int zeroCount(int num)
	{
	    if(num % 10 == 0)
	        return num;
	    else
	        return zeroCount(num / 10);
	}
}
	
	
	/*public static int numberOfZeros(int[]a){
		int count = 0;
		for(int i = 0; i < a.length; i++ ){
		if (a[i] == 0){
			count++;
		}
		}return count;
	}
	
	
	
	public static int[] parseBinaryToIntArray(String input) {
	    // TODO: Validation
	    int[] output = new int[input.length() / 32];
	    for (int i = 0; i < output.length; i++) {
	    String section = input.substring(i * 32, (i + 1) * 32);
	        output[i] = (int) Long.parseLong(section, 2);
	    }
	    return output;
	}
	*/
}
	
		   
	int	findHelper(array[], int left, int right){
		   if (left == right - 1){ 
		      return A[left];
		   }
		   else
		      max1 = findMaxHelper(A, left, (right + left) / 2);
		      max2 = findMaxHelper(A, (right + left) / 2, right);
		   

		      if (max1 > max2) {
		         return max1; 
		      }
		      else 
		         return max2;
		      
		}
	
	
	
	
	
	
	
	
}
