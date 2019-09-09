package pkg.hashSet;

import java.util.HashSet;
import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		name.add("Tom");
		name.add("Rich");
		name.add("Nancy");
		name.add("Ed");

		Iterator<String> ltr = name.iterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
		System.out.println("<==========================>");
		
		name.remove("Ed");
		Iterator<String> ltrr = name.iterator();
		while(ltrr.hasNext()){
			System.out.println(ltrr.next());
		}
	}

}
