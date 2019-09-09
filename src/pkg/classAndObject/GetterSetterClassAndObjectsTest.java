package pkg.classAndObject;

public class GetterSetterClassAndObjectsTest {

	public static void main(String[] args) {

		GetterSetterOfStudent st = new GetterSetterOfStudent();
		st.setId(121);
		st.setName("Nancy");
		st.setAge(30);
		
		GetterSetterOfStudent st1 = new GetterSetterOfStudent();
		st1.setId(332);
		st1.setName("Yusuf");
		st1.setAge(32);
		
		System.out.println("Name: "+st.getName()+" ID is "+st.getId()+" aged "+st.getAge());
		System.out.println("Name: "+st1.getName()+" ID is "+st1.getId()+" aged "+st1.getAge());
		

	}

}
