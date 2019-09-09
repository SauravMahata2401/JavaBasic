package pkg.arrayList;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>(6) ;
		myList.add(39);
		myList.add(3);
		myList.add(44);
		myList.add(11);
		myList.add(32);
		
		for(Integer x: myList){
			System.out.println(x);
			
		}
		System.out.println("ArrayList size is: "+myList.size());
		
		myList.trimToSize();
		System.out.println("ArrayList size is: "+myList.size());
		
		myList.remove(3);
		for(Integer x: myList){
			System.out.println(x);
			
		}
		System.out.println("ArrayList size is: "+myList.size());
		
		myList.set(0, 100);
		for(Integer x: myList){
			System.out.println(x);
			
		}
		System.out.println("ArrayList size is: "+myList.size());
		
		
		myList.clear();
		System.out.println("ArrayList size is: "+myList.size());
	}

}
