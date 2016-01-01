import java.util.LinkedList;


public class SortingMachine {

	//ascending bubble sort - integers
	public int[] bubbleSort(int[] a){	
		//sort a
		int temp;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		for (int i = 0; i < size-1; i++)
		{
			for (int j = 0; j < size-(i+1); j++)
			{
				//element comparison (a[j]> a [j+1]), increment count
				comparisonCount++;
				if (a[j] > a[j+1])				
				{ //swap
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//swap, increment count
					swapCount++;
				}
			}
		}
		System.out.println("End of bubble sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	//modified bubble sort for efficiency
	public int[] betterBubbleSort(int[] a){	
		//sort a
		int temp;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		//boolean variable to keep track of sorting, assume the array is sorted first
		boolean sorted=true;
		for (int i = 0; i < size-1; i++)
		{
			sorted=true; //reset this to true at each internal iteration
			for (int j = 0; j < size-(i+1); j++)
			{			
				//element comparison (a[j]> a [j+1]), increment count
				comparisonCount++;
				if (a[j] > a[j+1])				
				{ 
					//array is not sorted, update boolean variable
					sorted=false;
					//swap
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//swap, increment count
					swapCount++;
				}
			}
			// break the loop if the array is sorted
			if (sorted) break;
		}
		System.out.println("End of bubble sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	//bubble sort-descending order .. 
	public int[] descendingBubbleSort(int[] a){	
		int temp;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		boolean sorted=true;
		for (int i = 0; i < size-1; i++)
		{
			sorted=true;
			for (int j = 0; j < size-(i+1); j++)
			{			
				//element comparison (a[j]> a [j+1]), increment count
				comparisonCount++;
				if (a[j] < a[j+1])				
				{ 
					//array is not sorted, update boolean variable
					sorted=false;
					//swap
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//swap, increment count
					swapCount++;
				}
			}
			// break the loop if the array is sorted
			if (sorted) break;
		}
		System.out.println("End of descending bubble sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	//bubble sort for linked lists
	public LinkedList<Integer> bubbleSort(LinkedList<Integer> a){	
		//sort a
		int temp;
		int size = a.size();
		//counts
		int comparisonCount=0;
		int swapCount=0;
		//boolean variable to keep track of sorting, assume the array is sorted first
		boolean sorted=true;
		for (int i = 0; i < size-1; i++)
		{
			sorted=true; //reset this to true at each internal iteration
			for (int j = 0; j < size-(i+1); j++)
			{			
				//element comparison (a[j]> a [j+1]), increment count
				comparisonCount++;
				if (a.get(j) > a.get(j+1))				
				{ 
					//array is not sorted, update boolean variable
					sorted=false;
					//swap
					temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
					//swap, increment count
					swapCount++;
				}
			}
			// break the loop if the array is sorted
			if (sorted) break;
		}
		System.out.println("End of linked list bubble sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	//selection sort - integers	
	public int[] selectionSort(int[] a){	
		int temp, min;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		for (int i = 0; i < size; i++){		
			// find the index of the smallest element
			min =indexOfSmallestElement(a, i);
			//number of element comparison in indexOfSmallestElement is size - (i+1)
			comparisonCount+=size-i-1;
			//swap
			temp = a[min];
			a[min] = a[i]; 
			a[i] = temp;
			swapCount++;
		}
		System.out.println("End of selection sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}



	private int indexOfSmallestElement(int[] a, int i) {
		int min = i;
		for (int j = i + 1; j < a.length; j++)
		{
			if (a[j] < a[min])
				min = j; 
		}
		return min;
	}


	// modified selection sort	
	public int[] selectionSort2(int[] a){	
		int temp, max;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		for (int i = size-1; i >=0; i--){		
			// find the index of the largest element
			max =indexOfLargestElement(a, i);
			//number of element comparison in indexOfSmallestElement is size - (i+1)
			comparisonCount+=size-i-1;
			//swap
			temp = a[max];
			a[max] = a[i]; 
			a[i] = temp;
			swapCount++;
		}
		System.out.println("End of modified selection sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	private int indexOfLargestElement(int[] a, int i) {
		int max = i;
		for (int j = 0 ; j < i; j++)
		{
			if (a[j] > a[max])
				max = j; 
		}
		return max;
	}

	// insertion sort
	public int[] insertionSort(int[] a){	
		int temp;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		for (int i = 1; i < size; i++){
			int j = i;
			temp = a[i];
			while (j > 0 && temp < a[j - 1]){
				a[j] = a[j - 1]; // right shifting
				j--;
				swapCount++;
				comparisonCount++; // temp <a[j-1] in the while loop
			}

			a[j] = temp;
		}
		System.out.println("End of insertion sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	// insertion sort with left-shifting
	public int[] insertionSort2(int[] a){	
		int temp;
		int size = a.length;
		//counts
		int comparisonCount=0;
		int swapCount=0;
		for (int i = size-2; i >=0; i--){
			int j = i;
			temp = a[i];
			while (j < size-1 && temp > a[j + 1]){
				a[j] = a[j + 1]; // left shifting
				j++;
				swapCount++;
				comparisonCount++; // temp <a[j-1] in the while loop
			}

			a[j] = temp;
		}
		System.out.println("End of modified insertion sort");
		System.out.println("Number of element Comparisons "+ comparisonCount);
		System.out.println("Number of swap operations "+ swapCount);
		return a;
	}

	// insertion sort for objects
	public Comparable[] insertionSort(Comparable[] a){	
		Comparable temp;
		int size = a.length;
		for (int i = 1; i < size; i++){
			int j = i;
			temp = a[i];
			while (j > 0 && temp.compareTo(a[j - 1]) <0){
				a[j] = a[j - 1]; // right shifting
				j--;
			}
			a[j] = temp;
		}
		return a;
	}




}
