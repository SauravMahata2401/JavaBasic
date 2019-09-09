package pkg.Constructor;

public class Cube {
	
	int length;
	int bredth;
	int height;
	
	public int getCubeArea(){
		return (length * bredth * height);
	}
	
	public int getCubeVolume(){
		return (length * bredth);
	}
	
	Cube(){
		
		System.out.println("I'm inside the Constructor1!!");
		
		length = 10;
		bredth = 20;
		height = 30;
	}
	
	Cube(int le,int br){
		
		System.out.println("I'm inside the Constructor3!!");
		
		length = le;
		bredth = br;
	}

	
	Cube(int le,int br,int he){
		
		System.out.println("I'm inside the Constructor2!!");
		
		length = le;
		bredth = br;
		height = he;
	}

}
