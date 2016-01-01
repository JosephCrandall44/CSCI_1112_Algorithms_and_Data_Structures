
public class QuickSort_soltution {

	public static int count=0;
	public static void main(String[] args) {
		int[] someData=new int[10];
		//generate random data
		for (int i=0; i<someData.length;i++){
			int randomNumber=(int) (Math.random()*100) +1;
			someData[i]=randomNumber;
		}
		
		for (int i=0; i<someData.length;i++){
			someData[i]=i;
		}
		
	//	int [] someData2={7,2,6,4,0,1,3,5,8,9};
		
		
		count=0;
		quickSort(someData);
		
		
	}

	private static void quickSort(int[] data) {
		//call recursive quick sort
		quickSort(data, 0, data.length-1);
		
	}

	private static void quickSort(int[] data, int min, int max) {
		//add a condition for recursion
		if(min<max){
			//create partitions
			int indexOfPartition=partition(data, min, max);
			
			//add two recursive calls
			quickSort(data, min, indexOfPartition-1);
			quickSort(data, indexOfPartition+1, max);
			
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
			while (left<right && data[left] <=partitionElement){
				left++;
			}
			//Similarly, search for an element that is smaller than or equal to the partition element
			//decrement right until this element is found
			
			while(data[right] > partitionElement)
				right--;
			
			
			
			//swap the two elements
			if (left<right){
				swap(data, left, right);
			}
			
			
		}
		//right is now the index of an element that is <= partition element
		//move the partition element to its place
		swap (data, min, right);
		
		//return the index of the partition elemnt
		System.out.println("iteration "+ count);
		for (int i=0; i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		count++;
		
		return right;
		
		
	}

	private static void swap(int[] data, int middle, int min) {
		int temp=data[middle];
		data[middle]=data[min];
		data[min]=temp;
		
	}

}
