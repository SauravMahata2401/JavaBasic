package pkg.Constructor;

public class ConstructorCode {

	public static void main(String[] args) {
		
		Cube c = new Cube();
		int area = c.getCubeArea();
		System.out.println("Area of the Cube is: "+area);
		
		Cube c1 = new Cube(20,5,10);
		int area1 = c1.getCubeArea();
		System.out.println("Area of the Cube is: "+area1);
		
		Cube c2 = new Cube(20,5);
		int vol = c2.getCubeVolume();
		System.out.println("Area of the Cube is: "+vol);
		
	}
}
