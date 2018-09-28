package com.emma.week5;

public class Exercise3 {

    public static void main(String[] args) {
        new Exercise3().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: Define the array as seen in the exercise
        int[] array = { 4, 2, 6, 1 };
        int[] newarray = new int[array.length];
        // Step 2: Use a for-loop to print in reverse. (Remember the increment step? It can be negative..)
        System.out.println("// In code: [ 4, 2, 6, 1 ]:");
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newarray[j++] = array[i];
        }

        for (int k = 0; k < newarray.length; k++) {
            System.out.println(newarray[k]);
        }
        // End of code.
    }

}
