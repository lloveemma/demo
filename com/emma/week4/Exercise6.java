package com.emma.week4;
public class Exercise6 {

    public static void main(String[] args) {
        new Exercise6().run();
    }

    public void run() {
        // Your code goes below this line.

        // Tip: Use the charAt() method from the String class to select a specific letter on a certain location.
        // E.g. String firstName = "Tristan"; then firstName.charAt(0) == 'T', firstName.charAt(1) == 'r', etc.
        // Note that the counting starts at 0.
        System.out.print("Enter a code: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String code = scanner.nextLine();
        scanner.close();
        String output = "";
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == 'a') {
                output += "b";
            } else if (code.charAt(i) == 'b') {
                output += "c";
            } else if (code.charAt(i) == 'c') {
                output += "d";
            } else if (code.charAt(i) == 'd') {
                output += "e";
            } else if (code.charAt(i) == 'e') {
                output += "a";
            }
        }
        System.out.println("Your encrypted message is: " + output);
        // End of code.
    }
}
