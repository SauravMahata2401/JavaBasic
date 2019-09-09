package pkg.Finally;

public class FinallyTest {
	
	public static void main(String[] args) {
		
		try {
			int a = 100/0;
			System.out.println("Div value is: "+a);
		} catch (Exception e) {
			System.out.println("Called Catch!");
			System.out.println(e.getMessage());
		}finally{
			//System.exit(1) in this case this Finally will not be called
			System.out.println("Called finally!");
		}
		
	}

}
