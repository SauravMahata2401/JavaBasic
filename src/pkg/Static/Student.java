package pkg.Static;

public class Student {
	
	String name;
	int age;
	static int NoOfStudent;
	
	Student(){
		NoOfStudent++;
	}
	
	public static int getNoOfStudent(){
		
		return NoOfStudent;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

}
