package com.emma.week5;

public class Exercise4 {

    public static void main(String[] args) {
        new Exercise4().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: Create an array with randomly selected values. You can do this manually..
        System.out.println("// In code: [ 4, 2, 6, 1 ]:");
        int[] a1 = { 4, 2, 6, 1 };
        boolean error = false;
        // Step 2: Create a loop that starts at index 1 (because you want to look "backwards" you shouldn't start at 0) and ends at array.length
        for (int i = 1; i < a1.length; i++) {
            // Step 3: For each step, take a look at the value of the index to your left (so index-1) and see if that value is smaller than the current value. If so, continue. If not, print out an error
            if (a1[i - 1] > a1[i]) {
                System.out.println("The array is not in order!");
                // Step X: Glory can be achieved if you find some solution of "stopping" the loop as soon as you've found one inconsistency. You don't need to the check the rest if you found 1 "error"..
                error = true;
                break;
            }
        }
        if (!error) {
            System.out.println("That array is in order!");
        }
        

        System.out.println("// In code:  [ 1, 2, 4, 6 ]:");
        int[] a2 = { 1, 2, 4, 6 };
        error = false;
        // Step 2: Create a loop that starts at index 1 (because you want to look "backwards" you shouldn't start at 0) and ends at array.length
        for (int i = 1; i < a2.length; i++) {
            // Step 3: For each step, take a look at the value of the index to your left (so index-1) and see if that value is smaller than the current value. If so, continue. If not, print out an error
            if (a2[i - 1] > a2[i]) {
                System.out.println("The array is not in order!");
                // Step X: Glory can be achieved if you find some solution of "stopping" the loop as soon as you've found one inconsistency. You don't need to the check the rest if you found 1 "error"..
                error = true;
                break;
            }
        }
        if (!error) {
            System.out.println("That array is in order!");
        }
        
        //random array
        // Step 1: Create an array with randomly selected values. You can do this manually..
        java.util.Random random = new java.util.Random();
        int[] a_random = new int[random.nextInt(10)];
        for (int i = 0; i < a_random.length; i++) {
            a_random[i] = random.nextInt(100);
        }
        System.out.println("// In code: " + java.util.Arrays.toString(a_random));
        
        error = false;
        // Step 2: Create a loop that starts at index 1 (because you want to look "backwards" you shouldn't start at 0) and ends at array.length
        for (int i = 1; i < a_random.length; i++) {
            // Step 3: For each step, take a look at the value of the index to your left (so index-1) and see if that value is smaller than the current value. If so, continue. If not, print out an error
            if (a_random[i - 1] > a_random[i]) {
                System.out.println("The array is not in order!");
                // Step X: Glory can be achieved if you find some solution of "stopping" the loop as soon as you've found one inconsistency. You don't need to the check the rest if you found 1 "error"..
                error = true;
                break;
            }
        }
        if (!error) {
            System.out.println("That array is in order!");
        }
        // End of code.
    }

}
