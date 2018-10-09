package com.emma.week6;

public class Exercise2 {

    public static void main(String[] args) {
        new Exercise2().run();
    }

    public void run() {
        double valueOne = readDoubleFromUserWithMessage("Please enter the first value: ");
        double valueTwo = readDoubleFromUserWithMessage("Please enter the second value: ");
        double valueThree = readDoubleFromUserWithMessage("Please enter the third value: ");

        double lowestValue = determineLowestValue(valueOne, valueTwo, valueThree);

        System.out.println("The smallest value is " + lowestValue);
    }


    /**
     * Reads a double value from the user after prompting this with inputMessage
     * @param inputMessage The input message that is displayed before the double is prompted.
     * @return the double that was read from the user.
     */
    public double readDoubleFromUserWithMessage(String inputMessage) {
        // TODO: Fill in code.
        double d = 0;
        System.out.print(inputMessage);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        d = sc.nextDouble();
        return d;
    }

    /**
     * Determines the lowest value of the three arguments
     * @param first the first argument
     * @param second the second argument
     * @param third the third argument
     * @return the smallest of the three values
     */
    public double determineLowestValue(double first, double second, double third) {
        // TODO: Fill in code.
        double min = Math.min(third, Math.min(first, second));
        return min;
    }

}
