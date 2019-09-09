package pkg.Method;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		
		int value = Add(23, 43);
		System.out.println("Added value is: "+value);
		
		double value1 = Add(23.32, 13.32);
		System.out.println("Added value is: "+value1);
		
		String value2 = Add("Hello"," World");
		System.out.println("Added value is: "+value2);

	}
	
	public static int Add(int a,int b){
		
		int c =  a + b;
		return c;
	}
	
	public static double Add(double a,double b){
		
		double c =  a + b;
		return c;
	}
	
	public static String Add(String a,String b){
		
		String c =  a + b;
		return c;
	}

}
