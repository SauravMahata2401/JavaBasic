package pkg.listIterator;

import java.util.*;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mark");
		names.add("John");
		names.add("Joshep");
		names.add("Rohit");
		names.add("Nancy");

		ListIterator<String> ltr = names.listIterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
		System.out.println("========================");
		
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}
	}

}
