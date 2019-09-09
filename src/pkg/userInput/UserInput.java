package pkg.userInput;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String data = scan.nextLine();
		System.out.println("Given data is: "+data);

	}

}
