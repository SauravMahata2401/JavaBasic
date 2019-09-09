package pkg.Condition;

public class iFeLSE2 {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 101;
		
		if (a == 10 && b ==10){
			System.out.println("Both condition Matched");
		}else{
			if (a == 10 && b !=10){
				System.out.println("Condition A Matched");
			}else{
				System.out.println("Condition B Matched");
			}
		}
	}

}
