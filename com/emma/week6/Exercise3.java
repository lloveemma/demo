package com.emma.week6;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        new Exercise3().run();
    }

    public void run() {

        // Oops! We lost the program. Recreate it using the methods below.
        System.out.println("Calculate your BMI! ");
        double length = readLengthFromUser();
        int weight = readWeightFromUser();
        double bmi = calculateBMI(weight, length);
        System.out.println("Your BMI result is: " + bmi);
        if(bmi >= 22) {
            System.out.println("This means you are overweight");
        }

    }

    /**
     * Reads the length input (as double) from the user
     * @return The length of the user (as double)
     */
    public double readLengthFromUser() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your length (in metres): ");
        double result = myScanner.nextDouble();

        return result;
    }

    /**
     * Reads the weight input (as int) from the user
     * @return The weight of the user (as int)
     */
    public int readWeightFromUser() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        int result = myScanner.nextInt();

        return result;
    }

    /**
     * Calculates the BMI based on weight and length
     * @param weight The weight of the user (as int)
     * @param length The length of the user (as double)
     * @return The BMI, calculated as weight / (length * length)
     */
    public double calculateBMI(int weight, double length) {
        double result =  weight / (length * length);

        return result;
    }

}
