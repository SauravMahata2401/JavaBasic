package pkg.Static;

public class StudentClassTest {

	public static void main(String[] args) {


		Student Ramesh = new Student();
		Ramesh.setAge(20);
		Ramesh.setName("Ramesh");
		System.out.println("Student name "+Ramesh.getName()+" age "+Ramesh.getAge()+"No of Student now "+Ramesh.getNoOfStudent());
		
		
		Student Suresh = new Student();
		Suresh.setAge(21);
		Suresh.setName("Suresh");
		System.out.println("Student name "+Suresh.getName()+" age "+Suresh.getAge()+"No of Student now "+Suresh.getNoOfStudent());
		
		Student Nancy = new Student();
		Nancy.setAge(19);
		Nancy.setName("Nancy");
		System.out.println("Student name "+Nancy.getName()+" age "+Nancy.getAge()+"No of Student now "+Nancy.getNoOfStudent());
		
		
		int noOfStudent = Student.getNoOfStudent();
		System.out.println("Total no of Student is: "+noOfStudent);

	}

}
