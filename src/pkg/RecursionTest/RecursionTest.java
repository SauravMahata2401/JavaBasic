package pkg.RecursionTest;

import java.util.Scanner;

public class RecursionTest {
	
	
	public static int factorial(int n){
		
		if(n <= 1){
			return 1;
		}else{
			return (n * factorial(n-1));
			
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input: ");
		int val = scan.nextInt();
		int fact = factorial(val);
		System.out.println("Factorial value is: "+fact);
	}

}
