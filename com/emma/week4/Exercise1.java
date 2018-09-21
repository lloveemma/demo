package com.emma.week4;
public class Exercise1 {

    public static void main(String[] args) {
        new Exercise1().run();
    }

    public void run() {
        // Your code goes below this line.

        // You can print the board like you did earlier.. But don't forget the variables if you do!

        // Step 1 Prompt for input
        System.out.print("Please select a field (1-9): ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int step = scanner.nextInt();
        boolean exit = false;
        // Step 2 Verify this.. "as long as the input is not a number between 1 - 9" - > repeat the following
        do {
            if (step < 1 || step > 9) {
                // Step 2b: Ask for new input
                System.out.println("This value is out of range. Please enter a value between 1 and 9.");
                System.out.print("Please select a field (1-9): ");
                step = scanner.nextInt();
            }else{
                exit = true;
            }
        } while (!exit);
        
        // Step 3 Send out confirmation!
        System.out.println("That is a valid entry!");
        scanner.close();
        // End of code.
    }

}
