package pkg.abstractClass;

public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		Bank obA = new BankA();
		int interestA = obA.getInterest();
		System.out.println("Interest rate for Bank A is: "+interestA);
		
		Bank obB = new BankB();
		int interestB = obB.getInterest();
		System.out.println("Interest rate for Bank A is: "+interestB);	
	}
	

}
