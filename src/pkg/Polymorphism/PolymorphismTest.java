package pkg.Polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {

		Bank a = new BankA();
		int Ba = a.getInterest();
		System.out.println("Interest of BankA: "+Ba+".");

		Bank b = new BankB();
		int Bb = b.getInterest();
		System.out.println("Interest of BankB: "+Bb+".");
		
		Bank c = new BankC();
		int Bc = c.getInterest();
		System.out.println("Interest of Bankc: "+Bc+".");
	}

}
