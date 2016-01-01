import java.util.LinkedList;
import java.util.ListIterator;


public class program4 {
	
	private static <E> void CompareLinkedListsForOverlap(LinkedList<E> one, LinkedList<E> two, ListIterator<E> iterator){
		LinkedList<E> Itersection = new LinkedList<E>();
		while(((ListIterator<E>)one).hasNext()){
			if (two.contains((((ListIterator<E>)one).next()))){
				Itersection.add(((ListIterator<E>)one).hasNext());
		}		
		}
	}
}
//ran out of time
