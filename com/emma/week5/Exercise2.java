package com.emma.week5;

public class Exercise2 {

    public static void main(String[] args) {
        new Exercise2().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: Prompt the user the length of the array
        System.out.print("Enter the number of players:  ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int count = scanner.nextInt();
        // Step 2: Create an array with the length obtained in step 1
        String[] players = new String[count];
        String[] english_num = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        for (int i = 0; i < players.length; i++) {
            if (i < english_num.length) {
                System.out.print("Enter the name of player " + english_num[i] + ":");
            }else {
                System.out.print("Enter the name of player " + (i+1) + ":");
            }
            String name = scanner.next();
            players[i] = name;
        }
        scanner.close();
        // Step 3: Generate a random number between 0 and array.length
        int num = new java.util.Random().nextInt(players.length);
        // Step 4: Print out the value associated with the index that was just generated
        System.out.println(players[num]+" must go first!");
        // End of code.
    }

}
