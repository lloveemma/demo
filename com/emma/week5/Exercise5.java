package com.emma.week5;

public class Exercise5 {

    public static void main(String[] args) {
        new Exercise5().run();
    }

    public void run() {
        // Your code goes below this line.

        // No more comments from this point!
        String[] colors = { "red", "blue", "green", "yellow", "purple", "black" };
        
        String[] mastermindcolors = new String[4];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < mastermindcolors.length; i++) {
            mastermindcolors[i] = colors[random.nextInt(colors.length)];
        }

        System.out.println("The code is " + java.util.Arrays.toString(mastermindcolors));
        // End of code.
    }

}
