package temperature;

import java.util.Scanner;

public class TempreatureApplication {
	public static void main(String[] args) {
		// Declare Variables
		double centigrade = 0.0;
		double fahrenheit = 0.0;
		double totalFahrenheit = 0.0;
		double totalCentigrade = 0.0;
		int count = 0;
		Scanner scn = new Scanner(System.in);
		
		// Welcome User, get first input
		System.out.println("Welcome to the Temperature Program!");
		System.out.print("Enter Temp in Centigrade or <= -100.0 to quit: ");
		centigrade = scn.nextDouble();
		
		// Continues through loop
		while (centigrade > -100.0) {
			fahrenheit = (9.0/5.0) * centigrade + 32.0;
			System.out.printf("Tempreature: F(%.1f) C(%.1f)\n", fahrenheit, centigrade);
			totalFahrenheit += fahrenheit;
			totalCentigrade += centigrade;
			count++;
			System.out.print("Enter Temp in Centigrade or <= -100.0 to quit: ");
			centigrade = scn.nextDouble();
		}
		
		// Double-checks that user used the program, and did not exit at first prompt
		if(count > 0) {
			System.out.printf("Average: Centigrade(%.1f)\nAverage: Fahrenheit(%.1f)\n", totalCentigrade / count, totalFahrenheit / count);
		}
		
		// Exit
		System.out.println("Thank you for using the Temperature Program!");
		scn.close();
	}
}
