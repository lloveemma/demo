package com.emma.week5;

public class Exercise7 {

    public static void main(String[] args) {
        new Exercise7().run();
    }

    public void run() {
        // Your code goes below this line.
        System.out.print("Amount due (in cents): ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int due = scanner.nextInt();
        System.out.print("Amount paid (in cents): ");
        int paid = scanner.nextInt();
        System.out.print("Change: ");
        int change = paid - due;
        System.out.println(change);
        scanner.close();
        int[] currencies = { 100, 50, 20, 10, 5, 2, 1, 50, 20, 10, 5 };
        int[] cents = { 100, 100, 100, 100, 100, 100, 100, 1, 1, 1, 1 };
        String[] units = { "euro", "euro", "euro", "euro", "euro", "euro", "euro", "cent", "cent", "cent", "cent" };
        
        for (int i = 0; i < currencies.length; i++) {
            int count = change / (currencies[i] * cents[i]);
            change = change % (currencies[i] * cents[i]);
            System.out.println(currencies[i] + " " + units[i] + ":" + count);
        }
        // End of code.
    }

}
