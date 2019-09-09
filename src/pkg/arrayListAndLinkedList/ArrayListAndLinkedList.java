package pkg.arrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {

		
		System.out.println("<=======ARRAY LIST=======>");
		ArrayList<Integer> myList = new ArrayList<Integer>(7);
		
		long AL_start_time = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			myList.add(39);
			myList.add(23);
			myList.add(33);
			myList.add(23);
			myList.add(11);
			myList.add(24);
			myList.add(45);
		}
		
		long AL_end_time = System.currentTimeMillis();
		long AL_time_diff = (AL_end_time - AL_start_time);
		System.out.println("ArrayList execution time taken: "+AL_time_diff+" ms");

		System.out.println("<=======LINKED LIST=======>");
		
		LinkedList<Integer> myList1 = new LinkedList<Integer>();
		
		long LL_start_time = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			myList1.add(39);
			myList1.add(23);
			myList1.add(33);
			myList1.add(23);
			myList1.add(11);
			myList1.add(24);
			myList1.add(45);
		}
		
		long LL_end_time = System.currentTimeMillis();
		long LL_time_diff = (LL_end_time - LL_start_time);
		System.out.println("LinkedList execution time taken: "+LL_time_diff+" ms");
		
		System.out.println("<===========================>");
		
		if(AL_time_diff > LL_time_diff){
			System.out.println("LinkedList execution is FASTER");
		}else if (AL_time_diff == LL_time_diff) {
			System.out.println("LinkedList ArrayList execution speed are SAME");
		}else if (AL_time_diff < LL_time_diff) {
			System.out.println("ArrayList execution is FASTER");
		}
		
	}
	
}
