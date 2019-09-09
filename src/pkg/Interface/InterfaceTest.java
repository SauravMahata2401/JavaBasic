package pkg.Interface;

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		BankABC abc = new BankABC();
		int ir = abc.getInterestRate();
		System.out.println("Interest Rate of ABC Bank is: "+ir);
	}

}
