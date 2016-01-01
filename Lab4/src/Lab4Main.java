import java.util.LinkedList;


public class Lab4Main {

	public static void main(String[] args) {
		SortingMachine sorter= new SortingMachine();
		//array of integers
		int[] x= {4, 5, 3, 63, 7, 9, 10, 43, 28, 43, 85, 20, 19, 3, 5, 10, 11, 9, 24, 29, 30};		

		
		// array of objects of type Person
		Person[] z=new Person[10];
		for (int i=0; i<z.length; i++){
			int score=(int) (Math.random()*100);
			String first="person";
			String last=""+i;
			z[i]=new Person(first, last, score);
		}
		
		// sort x here
		//sorter.bubbleSort(x);
		//sorter.betterBubbleSort(x);
		//sorter.descendingBubbleSort(x);
		//sorter.selectionSort(x);
		//sorter.selectionSort2(x);
		//sorter.insertionSort(x);
		sorter.insertionSort2(x);
		
		//resort x
		//sorter.bubbleSort(x);
		//sorter.betterBubbleSort(x);
		
		
		//print out the elements 
		System.out.println("Elements of x after sorting : ");
		for (int i=0; i<x.length; i++){
			System.out.println(x[i]);
		}
		
		
		
		// sort z here
		sorter.insertionSort(z);
		//print out the elements
		System.out.println("Elements of z after sorting: ");
		for (int i=0; i<z.length; i++){
			System.out.println(z[i]);
		}
		
	}

}
