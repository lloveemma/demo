package com.emma.week6;

public class Exercise8 {

    public static void main(String[] args) {
        new Exercise8().run();
    }

    public void run() {
        int[] fourNumbers = { 2, 6, 2, 4 };
        int[] sevenNumbers = { 4, 6, 2, 3, 4, 5, 6 };

        int[] twoNumbers = removeMiddleElements(fourNumbers); // This should be { 2, 4 }
        int[] sixNumbers = removeMiddleElements(sevenNumbers); // This should be { 4, 6, 2, 4, 5, 6 }

        System.out.println("The result of removing two values from the array { 2, 6, 2, 4 } ");
        printArray(twoNumbers);

        System.out.println("The result of removing one value from the array { 4, 6, 2, 3, 4, 5, 6 } ");
        printArray(sixNumbers);
    }

    private int[] removeMiddleElements(int[] arr) {
        int[] result;
        int j = 0;
        int length = arr.length;
        int idx_m = length / 2;
        if (idx_m % 2 == 0) // ÒÆ³ýidx_m -1 ºÍ idx_m
        {
            result = new int[length - 2];
            for (int i = 0; i < arr.length; i++) {
                if (i != idx_m - 1 && i != idx_m) {
                    result[j++] = arr[i];
                }
            }
        } else {// ÒÆ³ýidx_m
            result = new int[length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i != idx_m) {
                    result[j++] = arr[i];
                }
            }
        }
        return result;
    }

    private void printArray(int[] arr) {
        // System.out.println(java.util.Arrays.toString(arr));
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }


}
