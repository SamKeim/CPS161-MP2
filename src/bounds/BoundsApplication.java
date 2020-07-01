package bounds;

import java.util.Scanner;

public class BoundsApplication {
	
	public static String findBounds(int lowerBound, int upperBound, int step) {
		// Declare variables
		String returnString = "";
		int count = 0;
		int number = lowerBound;
		
		// While loop to construct single line string of 10 numbers
		while(count < 10 && (number + step) < upperBound) {
			number = lowerBound + (step * count);
			returnString += ((count == 0)? "" : " ") + number;
			count++;
		}
		
		// Recursion statement. I realize this is over-complicated but I wanted to practice using recursion methods
		if(number < upperBound) {
			returnString += "\n";
			returnString += findBounds(number + step, upperBound, step);
		}
		
		// Exit when upperBound is reached
		return returnString;
	}
	
	public static void main(String args[]) {
		// Declare scanner
		Scanner scn = new Scanner(System.in);
		
		// Get user input
		System.out.println("Welcome to the Bounds Program.");
		System.out.print("Please enter a lower bound: ");
		int lowerBound = scn.nextInt();
		System.out.print("Please enter an upper bound: ");
		int upperBound = scn.nextInt();
		System.out.print("Please enter a step size: ");
		int step = scn.nextInt();
		
		// Get result and print, exit
		String results = findBounds(lowerBound, upperBound, step);
		System.out.println("Your results:");
		System.out.println(results);
		System.out.println("Thank you for using the Bounds Program.");
		scn.close();
	}
}
