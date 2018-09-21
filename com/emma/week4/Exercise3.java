package com.emma.week4;
public class Exercise3 {

    public static void main(String[] args) {
        new Exercise3().run();
    }

    public void run() {
        // Your code goes below this line.

        // Read up on the leap year.. algorithm provided on Wikipedia

        // Step 1: Ask for the year.
        System.out.print("Please enter the year: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int year = scanner.nextInt();
        // Step 2: Check if it's a leap year :-)
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		scanner.close();
        // End of code.
    }

}