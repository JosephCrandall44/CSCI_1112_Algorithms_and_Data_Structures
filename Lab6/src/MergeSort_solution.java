
public class MergeSort_solution {
public static int count=0;
	public static void main(String[] args) {
		

		int[] someData=new int[10];
		//generate random data
		for (int i=0; i<someData.length;i++){
			int randomNumber=(int) (Math.random()*100) +1;
			someData[i]=randomNumber;
		}
		
		for (int i=0; i<someData.length;i++){
		//	someData[i]=i;
		}
			
		count=0;
		mergeSort(someData);
		
		
		
	}
	
	public static void mergeSort(int[] data){
		//call the recursive mergeSort method
		mergeSort(data, 0, data.length-1);
	}

	private static void mergeSort(int[] data, int startIndex, int endIndex) {

		// add a condition for recursion (the opposite of the base case)
		if (startIndex<endIndex){
			
			//find index of middle element
			int midIndex= (startIndex+endIndex)/2;
			
			//recursive calls for first and second half of the array
			mergeSort(data, startIndex, midIndex);
			mergeSort(data, midIndex+1, endIndex);
			
			//merge the elements of each side of the array
			merge(data, startIndex, midIndex, endIndex);
			
		}
		
	}

	// Merge the elements of the array around the middle index. 
	private static void merge(int[] data, int minIndex, int midIndex, int maxIndex) {
		
		//temporary array to hold the solution
		int[] temp=new int[data.length];
		
		//specify the end points for each subarray
		int first1=minIndex;
		int last1=midIndex;
		int first2=midIndex+1;
		int last2=maxIndex;
		
		//index for updating temp
		int index=first1;
		
		//copy smaller items from each subarray  into temp until one of the subarrays is exhausted		
		while (first1<=last1 &&  first2<=last2){
			//compare the elements at index first1 and first2
			//copy the smallest element into temp
			//increment first1 and first2 accordingly (only increment the index if the item is copied)
			if (data[first1]<data[first2]){
				temp[index]=data[first1];
				first1++;
			}else {
				temp[index]=data[first2];
				first2++;
			}
			
			index++;
		}
		
		//copy remaining elements from first subarray (if any) into temp
		
		while (first1<=last1){
			//copy item at index first1 into temp
			//increment first1 and index
			temp[index]=data[first1];
			first1++;
			index++;
		}
		
		//Similarly, copy remaining elements from second subarray (if any) into temp
		while (first2<=last2){
			//copy item at index first1 into temp
			//increment first1 and index
			temp[index]=data[first2];
			first2++;
			index++;
		}
		
		
		//finally, copy merged data into original array
		for (index =minIndex; index <=maxIndex; index++){
			data[index]=temp[index];
		}	
		
		count++;
		//return the index of the partition elemnt
		System.out.println("iteration "+ count);
		for (int i=0; i<data.length;i++){
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
	}

}
