package pkg.AccessModifiers;

public class AccessModifiersTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.age=25;
		
		student.setName("Saurav");
		String name = student.getName();
		System.out.println("My name is: "+name+" age is "+student.age);

	}

}
