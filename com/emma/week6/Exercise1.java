package com.emma.week6;

public class Exercise1 {

    public static void main(String[] args) {
        new Exercise1().run();
    }

    public void run() {
        System.out.print("Please enter the first value: ");
        int valueOne = readIntFromUser();
        System.out.print("Please enter the second value: ");
        int valueTwo = readIntFromUser();
        System.out.print("Please enter the third value: ");
        int valueThree = readIntFromUser();

        double average = calculateAverage(valueOne, valueTwo, valueThree);

        System.out.println("The average of the three values is: " + average);
    }

    /**
     * Returns the user input as an integer.
     * @return the integer that was read from user.
     */
    public int readIntFromUser() {
        // TODO: Fill in code. Create a Scanner in this method.
        int n = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        n = sc.nextInt();
        return n;
    }

    /**
     * Returns the average of the three specified arguments.
     * @param first the first value
     * @param second the second value
     * @param third the third value
     * @return The average of first, second and third
     */
    public double calculateAverage(int first, int second, int third) {
        // TODO: Fill in code.
        return (first + second + third) * 1.0 / 3;
    }

}
