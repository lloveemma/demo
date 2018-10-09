package com.emma.week6;

import java.util.Random;

public class Exercise4 {

    public static void main(String[] args) {
        new Exercise4().run();
    }

    public void run() {
        String[] names = readStringFromUser(10); // Fill an array with 10 names as String. The names CANNOT be empty!

        int randomValue = generateRandomNumber(0, names.length); // Generate a random number between 0 and (not including) names.length.

        System.out.println(names[randomValue] + " was selected!");
    }

    // TODO: Create method readStringFromUser(..)
    private String[] readStringFromUser(int count) {
        String[] result = new String[count];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        for (int i = 0; i < count; i++) {
            System.out.print("Please enter a name:");
            String name = sc.next();
            result[i] = name;
        }
        
        return result;
    }
    // TODO: Create method generateRandomNumber(..);
    private int generateRandomNumber(int start, int bound) {
        Random random = new Random();
        int n = random.nextInt(bound);
        
        while (n < start) {
            n = random.nextInt(bound);
        }
        
        return n;
    }

}
