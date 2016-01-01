import java.util.LinkedList;

public class LinkedListSorting {
		
	private static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
		if (list.size()>1){
		int midIndex= (list.size()-1)/2;
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		//recursive calls for first and second half of the list
		list1=mergeSort(list1);
		list2=mergeSort(list2);
		//merge the elements of the two lists
		list= merge(list1, list2);
		}
		return list;
		}
	
	private static void findLargestElemenetInFirstListAndAddtoHeadOfSecondList(
			LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		
	}
	
	public static void main(String[]args){
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(55);
		list1.add(67);
		list1.add(12);
		list1.add(5);
		list1.add(67);
		list1.add(12);
		list1.add(11);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(14);
		list2.add(55);
		list2.add(67);
		list2.add(12);
		list2.add(55);
		list2.add(6);
		list2.add(2);
		list2.add(11);
		
		findLargestElemenetInFirstListAndAddtoHeadOfSecondList(list1, list2);
		
	}

	

}
