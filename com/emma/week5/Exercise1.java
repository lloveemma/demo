package com.emma.week5;

public class Exercise1 {

    public static void main(String[] args) {
        new Exercise1().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: Define a character array with 9 fields.
        char[] pos = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // Step 2: Print the fields in the right layout.
        System.out.print("Input a field (1-9): ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String field = scanner.next();
        scanner.close();
        // Method 1
        for (int i = 0; i < pos.length; i++) {
            if (String.valueOf(i + 1).equals(field)) {
                System.out.print(" X ");
            } else {
                System.out.print(" " + pos[i] + " ");
            }
            if ((i + 1) % 3 == 0) {
                System.out.println();
                if (i != pos.length - 1) {
                    System.out.println("-----------");
                }
            } else {
                System.out.print("|");
            }
        }

        // Method 2
        for (int i = 0; i < pos.length; i++) {
            if (String.valueOf(i + 1).equals(field)) {
                pos[i] = 'X';
            }
        }
        String line = "";
        System.out.println();
        line = " " + pos[0] + " | " + pos[1] + " | " + pos[2];
        System.out.println(line);
        System.out.println("-----------");
        line = " " + pos[3] + " | " + pos[4] + " | " + pos[5];
        System.out.println(line);
        System.out.println("-----------");
        line = " " + pos[6] + " | " + pos[7] + " | " + pos[8];
        System.out.println(line);
        System.out.println();
        // End of code.
    }

}
