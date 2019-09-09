package pkg.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Nancy");
		myList.add("Karolin");
		myList.add("Maven");
		myList.add("Rose");
		myList.add("Ed");
		myList.add("Cendy");
		myList.add("April");
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		
		myList.removeLast();
		myList.removeFirst();
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		
		myList.addLast("Shivangi");
		myList.addFirst("Rajiv");
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		
		myList.add(3, "Added_Sam");
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		
		myList.set(3, "Set_added_Sam");
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		
		myList.remove(3);
		
		for (String x: myList) {
			System.out.println("Data's are: "+x);
		}
		
		System.out.println("==============");
		System.out.println("ArrayList size is: "+myList.size());
	}

}
