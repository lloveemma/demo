package com.emma.week4;
public class Exercise7 {

    public static void main(String[] args) {
        new Exercise7().run();
    }

    public void run() {
        // Your code goes below this line.


        // The clue is the condition for the loop.. "as long as the input is not equal to 0 do..."
        System.out.print("Please enter the first number: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int v = scanner.nextInt();
        int count = 1;
        int sum = v;
        while (v != 0) {
            System.out.print("Please enter another value (enter 0 to quit): ");
            v = scanner.nextInt();
            if (v != 0){
                sum += v;
                count++;
            }
        }
        scanner.close();
        double avg = sum * 1.0 / count;
        System.out.println("The average is " + avg);
        // End of code.
    }

}
