import java.util.LinkedList;


public class Program3 {
     
	private int[] array;
	private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    public class Time{
    	int hour;
    	int min;
    	boolean ampm;
    }
    
    public class LinkedListSorting {
		
    	private LinkedList<Time> quickSort(LinkedList<Time> list) {
    		if (list.size()>1){
    		int midIndex= (list.size()-1)/2;
    		LinkedList<Time> list1 = new LinkedList<Time>();
    		LinkedList<Time> list2 = new LinkedList<Time>();
    		//recursive calls for first and second half of the list
    		list1=quickSort(list1);
    		list2=quickSort(list2);
    		//merge the elements of the two lists
    		list= merge(list1, list2);
    		}
    		return list;
    		}
    	
    	private LinkedList<Time> merge(LinkedList<Time> list1,
				LinkedList<Time> list2) {
			// TODO Auto-generated method stub
			return null;
		}

    
    public static void main(String a[]){
         
        Program3 sorter = new Program3();
        int[] hour = {24,2,45,20,56,75,2,56,99,53,12};
        int[] min = {24,2,45,20,56,75,2,56,99,53,12};
        boolean[] ampm  = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}


}
