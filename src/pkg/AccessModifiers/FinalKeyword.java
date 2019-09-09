package pkg.AccessModifiers;

public class FinalKeyword {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		System.out.println("Previous value is: "+hello.age);
		hello.age=122;
		System.out.println("New value is: "+hello.age);

	}

}
