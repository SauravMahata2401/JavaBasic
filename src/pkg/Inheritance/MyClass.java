package pkg.Inheritance;

public class MyClass {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle();
		double t_area = tri.area(12, 4);
		System.out.println("Triangle area is: "+t_area);
		
		Rectangles rect = new Rectangles();
		double r_area = rect.area(32, 43);
		System.out.println("Triangle area is: "+r_area);

	}

}
