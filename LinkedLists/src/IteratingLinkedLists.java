import java.util.*;
public class IteratingLinkedLists {
	
	private static void printElementsBetweenFistOccuranceOfXandFistOccuranceOfY(ListIterator<Integer> iterator, int x, int y) {	
	boolean checker = false;
	while(iterator.hasNext()){
		int temp = iterator.next();
		if (temp == x){
			checker = true;
		}
		if(temp == y){
			checker = false;
		}
		if(checker == true){
			System.out.print(temp + "");
		}
	}
	}
	
	private static void removesAllRepeatedIntegersFromTheList(ListIterator<Integer> iterator){
	LinkedList<Integer> temp = new LinkedList<Integer>();
	boolean checker = false;
	while(iterator.hasNext()){
		int x = iterator.next();
		if (temp.contains(x)){
			iterator.remove();
		}else temp.add(x);	
	}		
	}
	
	private static LinkedList<Integer> createsANewLinkedListThatHasTheSameElementsAsTheOriginalListButInTheReverseOrder(ListIterator<Integer> iterator){
		LinkedList<Integer> newlist = new LinkedList<Integer>();
		while(iterator.hasNext()){
			newlist.addFirst(iterator.next());
		}
		return newlist;
	}
	
	private static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
		if (list.size()>1){
		int midIndex= (list.size()-1)/2;
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		//recursive calls for first and second half of the list
		list1=mergeSort(list1);
		list2=mergeSort(list2);
		//merge the elements of the two lists
		//list= merge(list1, list2);
		}
		return list;
		}
	/*
	private static LinkedList<Integer> merge(LinkedList<Integer> list1,
			LinkedList<Integer> list2) {
		// TODO Auto-generated method stub
		return null;
	}
	

	private static void findLargestElemenetInFirstListAndAddtoHeadOfSecondList(
			LinkedList<Integer> list1, LinkedList<Integer> list2, ListIterator<Integer> iterator) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		boolean checker = false;
		while(((ListIterator<Integer>)list1).hasNext()){
			int x = ((ListIterator<Integer>)list1).next();
			temp.add(x);
			
			if (temp.contains(x) > ){ //?
				iterator.remove();
			}else temp.add(x);	
	}
	
	
	*/
	
	
		
	public static void main (String[]args){	
		LinkedList<Integer> test = new LinkedList<Integer>();
		test.add(10);
		test.add(55);
		test.add(20);
		test.add(12);
		test.add(5);
		test.add(67);
		test.add(12);
		test.add(11);
		int x = 20;
		int y = 12;
		ListIterator<Integer> move = (ListIterator<Integer>) test.listIterator();
		printElementsBetweenFistOccuranceOfXandFistOccuranceOfY(move, x, y);
		
		//removesAllRepeatedIntegersFromTheList(move);
		
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
		
		//findLargestElemenetInFirstListAndAddtoHeadOfSecondList(list1, list2);
		
	}
}
