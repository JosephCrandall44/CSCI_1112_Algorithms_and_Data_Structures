
public class IntegerArray {

	private int[] array;
	
	//constructor 
	public IntegerArray(int size){
		array=new int[size];
	}
	
	public void sequentialValues(){
		// set the values in the array to 0, 1, 2, 3, ....
		for (int i=0; i<array.length; i++){
			array[i]=i;
		}
	}
	
	public void alternatingValues(){
		//set the values of the array to 0,1,0,1,....
		for (int i=0; i<array.length; i++){
			//the remainder after dividing by 2
			array[i]=i%2;
		}
		
	}
	
	public void randomValues(){
		// set the values of the array to random values between 0 and 10
		for (int i=0; i<array.length;i++){
			int randomNumber=(int) (Math.random()*10) +1;
			array[i]=randomNumber;
		}
	}
		
	public void printElements(){
		//print the elements of the array in order
		for (int i=0; i<array.length; i++){
			System.out.println("Element "+ i + " : "+ array[i]);
		}
	}
	
	public void printBackwards(){
		//print the elements of the array backwards
		for (int i=array.length-1; i>=0; i--){
			System.out.println("Element "+ i + " : "+ array[i]);
		}
	}
	
	public int sumArray(){
		//add up the elements of the array and return the sum
		int sum=0;
		for (int i=array.length-1; i>=0; i--){
			sum+=array[i];
		}
		return sum;
	}
	
	// Bonus 1 - 
	public void frequencies(){
		int[] freqs=new int[10];
		//calculate frequencies
		for (int i=0; i<array.length; i++){
			// make sure elements are less than or equal to 10
			if (array[i]<=10){
				//update frequencies
				int index=array[i]-1;
				freqs[index]++;
			}
		}
		
		// print the histogram
		for (int i=0; i<freqs.length;i++){
			System.out.print(i+"\t:");
			for (int j=0; j<freqs[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//find the maximum
	public int max(){
		int max=array[0];
		for (int i=1; i<array.length;i++){
			if (array[i]>max)
				max=array[i];
		}
		return max;
	}
	
	//sequential search
	public int sequentialSearch(int target){
		int index=-1;
		for (int i=0; i<array.length;i++){
			// add delay
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (array[i]==target){
				//elemetn found, return index
				return i;
			}
		}
		return index;
	}
	
	//binary search
	public int binarySearch(int target){
		int low=0;
		int high=array.length-1;		
		while(low<=high){
			// add delay
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int mid=(low+high)/2;
			if (array[mid]==target){
				//found target, return the index
				return mid;
			}else if (target<array[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
	}
	
	
	//alternative algorithm for binary search : Using recursion instead of a loop
	public int recursiveBinarySearch(int first, int size, int target){
		if (size<=0) return -1;
		int mid=first+(size/2);
		if (target==array[mid]) return mid;
		else if (target <array[mid])
			return recursiveBinarySearch(first, size/2, target);
		else
			return recursiveBinarySearch(mid+1, (size-1)/2, target);
	}
	
	
	
	
}
