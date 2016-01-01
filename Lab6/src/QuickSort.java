
public class CopyOfQuickSort {

	public static void main(String[] args) {
		int[] someData=new int[20];
		//generate random data
		for (int i=0; i<someData.length;i++){
			int randomNumber=(int) (Math.random()*100) +1;
			someData[i]=randomNumber;
		}
		
		quickSort(someData);
		
		
	}

	private static void quickSort(int[] data) {
		//call recursive quick sort
		quickSort(data, 0, data.length-1);
		
	}

	private static void quickSort(int[] data, int min, int max) {
		//add a condition for recursion
		if(){
			//create partitions
			int indexOfPartition=partition(data, min, max);
			
			//add two recursive calls
			
		}
		
	}

	private static int partition(int[] data, int min, int max) {
		int partitionElement;
		int left, right;
		int middle=(min+max)/2;
		
		//use the middle element as the partition value
		partitionElement=data[middle];
		
		//move the partition element to the start of the subarray	
		swap(data, middle, min);
		
		left=min;
		right=max;
		while (left <right){
			//we want to find an element in the left that is > the partition element
			//compare elements starting from left to right, and increment left until a larger element is found
			while (left<right && data[left] <partitionElement){
				left++;
			}
			//Similarly, search for an element that is smaller than or equal to the partition element
			//decrement right until this element is found
			
			
			
			
			//swap the two elements
			if (left<right){
				swap(data, left, right);
			}
			
			
		}
		//right is now the index of an element that is <= partition element
		//move the partition element to its place
		swap (data, min, right);
		
		//return the index of the partition elemnt
		return right;
		
		
	}

}
