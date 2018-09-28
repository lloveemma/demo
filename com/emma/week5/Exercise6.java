package com.emma.week5;

public class Exercise6 {

    public static void main(String[] args) {
        new Exercise6().run();
    }

    public void run() {
        // Your code goes below this line.

        System.out.println("// In code: [ 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 ]");
        int[] a = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < 100; i++) {
            int index1 = random.nextInt(a.length);
            int index2 = random.nextInt(a.length);
            int tmp = a[index1];
            a[index1] = a[index2];
            a[index2] = tmp;
        }

        System.out.println("The shuffled array is now: " + java.util.Arrays.toString(a));
        // End of code.
    }
}
