package factorial;

import java.util.Scanner;

public class FactorialApplication {
	public static int factorial(int n) {
		int factorial = n;
		while(n > 1) {
			n--;
			factorial *= n;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		// Declare Variables
		String answer = "";
		Scanner scn = new Scanner(System.in);
		
		// Welcome user and enter loop
		System.out.println("Welcome to the Factorial Program.");
		do {
			System.out.print("Enter in N: ");
			int n = scn.nextInt();
			System.out.println("Factorial: " + factorial(n));
			System.out.println("Do you want to continue? (Y/N)");
			scn.nextLine();
			answer = scn.nextLine();
		} while (answer.toUpperCase().startsWith("Y"));
		System.out.println("Thank you for using the Factorial Program.");
		scn.close();
	}
}
