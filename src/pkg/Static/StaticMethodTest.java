package pkg.Static;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		HelloClass hello = new HelloClass();
		String printNSC = hello.NonStaticClass("This is not Static Class.");
		System.out.println(printNSC);
		
		String printSC = HelloClass.StaticClass("This is Static Class.");
		System.out.println(printSC);

		HelloClass.age=10;
		System.out.println("Age is: "+HelloClass.age+".");
		
		hello.ID=3231;
		System.out.println("My ID is: "+hello.ID+".");
	}

}
