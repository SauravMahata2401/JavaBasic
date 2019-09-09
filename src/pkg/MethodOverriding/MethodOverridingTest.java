package pkg.MethodOverriding;

public class MethodOverridingTest {

	public static void main(String[] args) {
		
		Bank b = new BankA();
		System.out.println("Bank interest rate is: "+b.getInterstRate());

	}

}
