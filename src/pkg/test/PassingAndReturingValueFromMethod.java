package pkg.test;

public class PassingAndReturingValueFromMethod {

	public static void main(String[] args) {
		
		
			myfirstMethod("This is MyBro!!");
			myfirstMethod("This is Saurav.....");
			myfirstMethod("I'm a Tester!!");
			mySecondFunction(10, 33);
			int value =myThiredMethod(10, 5);
			System.out.println("Multiplication value is: "+value);

	}
	
	public static void myfirstMethod(String value){
		
		System.out.println(value);
	}

	public static void mySecondFunction(int a,int b){
		
		int c = a+b;
		System.out.println("Added value is: "+c);
		
	}
	
	public static int myThiredMethod(int a,int b){
		
		int c = a * b;
		return c;
		
	}
	
}
