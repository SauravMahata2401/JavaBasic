package pkg.Condition;

public class iFeLSE {
	
	public static void main(String[] args) {
		
		int i=10;
		if(i <= 5){
			System.out.println("i is not 10");
		}else{
				if(i != 10){
					System.out.println("i is not 10");
				}else{
						if(i > 5){
							System.out.println("i is not 10");
						}else{
							System.out.println("Yes I is 10");
						}
				}
		}
	
	}

}
