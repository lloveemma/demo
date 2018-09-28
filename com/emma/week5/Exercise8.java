package com.emma.week5;

public class Exercise8 {

    public static void main(String[] args) {
        new Exercise8().run();
    }

    public void run() {
        // Your code goes below this line.
        
        int[] array = { 4, 2, 1, 6, 9 };
        System.out.println("// In code: [4 2 1 6 9]");
        boolean isduplicated = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isduplicated = true;
                    break;
                }
            }
        }
        if (isduplicated) {
            System.out.println("There are duplicates in the array!");
        } else {
            System.out.println("There are no duplicates in the array!");
        }
        
        array = new int[]{ 1, 2, 3, 4, 4};
        System.out.println("// In code: [1 2 3 4 4]");
        isduplicated = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isduplicated = true;
                    break;
                }
            }
        }
        if (isduplicated) {
            System.out.println("There are duplicates in the array!");
        } else {
            System.out.println("There are no duplicates in the array!");
        }
        // End of code.
    }

}
