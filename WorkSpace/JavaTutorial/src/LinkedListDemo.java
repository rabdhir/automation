import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	/***
	 * Array List = {0, 1, 2, 3, 4, 5, 6}
	 * Linked List - [0] > [1] > [2]
	 * 					<     <
	 * Array List - when you have to add at the end and remove at the end 
	 * and retrieving is fast
	 * Linked list = when you have to add at the beginning and remove from
	 * the beginning
	 */
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		// Adding
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Size
		int size = cars.size();
		System.out.println("Size of cars is: " + size);

		// Get
		System.out.println("The item of index 1 is: " + cars.get(1));
		
		//Iteration
		System.out.println("Iteration example");
		for (int i=0; i < size; i++) {
			System.out.println("Item on index " + i + " is " + cars.get(i));
		}
		
		System.out.println("\nNext for loop example");
		for (String car: cars) {
			System.out.println("The item is :" + car);
		}
		
		/*
		 * To remove lots of thing, use LinkList, instead of ArrayList
		 * this is for memory management efficiency 
		 */
		// To remove
		//This will remove the second item
		cars.remove(size - 1);
		System.out.println("\nNext for loop example after removing");
		for (String car: cars) {
			System.out.println("The item is :" + car);
		}
		
		List<Integer> lList = new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
	}
	
	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\nBeginning of the duration for " + listType);
		for (int i=0; i < 100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		long startTime = System.currentTimeMillis();
		for (int i = size; i < elementToAdd; i++) {
			// list.add(i);
			list.add(0, i);
		}
		
/*		for (int j=90000; j< 92000; j++) {
			list.remove(j);
		}*/
		
		for (int j=0; j < 4000; j++) {
			list.remove(j);
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of the list " + listType + " is " + duration + " ms.");
	}

}
