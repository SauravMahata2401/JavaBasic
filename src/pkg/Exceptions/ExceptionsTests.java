package pkg.Exceptions;

public class ExceptionsTests {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
			System.out.println("Div value is: "+a);
		} catch (Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
		
		try {
			int arr[] = new int[2];
			System.out.println("Value's are: "+arr[3]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception is: "+ex.getMessage());
		}

	}

}
