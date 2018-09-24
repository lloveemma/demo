package com.emma.week4;
public class Exercise4 {

    public static void main(String[] args) {
        new Exercise4().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: initialize 6 variables for the possible outcomes.
    	int d1 = 0;
    	int d2 = 0;
    	int d3 = 0;
    	int d4 = 0;
    	int d5 = 0;
    	int d6 = 0;
        // Step 2: Prompt for the amount of tosses
    	System.out.print("Amount of tosses? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int tosses = scanner.nextInt();
        scanner.close();
        // Step 3: Create a loop that loops for the amount that was specified.
        for(int i=0;i<tosses;i++){
            // Step 4: Inside the loop, throw a die.
        	int die = new java.util.Random().nextInt(6);
            // Step 5: Count the outcome onto the right variable
			if (die == 0) {
				d1++;
			} else if (die == 1) {
				d2++;
			} else if (die == 2) {
				d3++;
			} else if (die == 3) {
				d4++;
			} else if (die == 4) {
				d5++;
			} else if (die == 5) {
				d6++;
			}
        }
        // Step 6: After the loop: print the results of the variables
		System.out.println("Ones: " + d1);
		System.out.println("Twos: " + d2);
		System.out.println("Threes: " + d3);
		System.out.println("Fours: " + d4);
		System.out.println("Fives: " + d5);
		System.out.println("Sixes: " + d6);
        // Step 7: Calculate the average. (Please don't forget it's a weighted average!)
		double avg = (d1 + 2*d2 + 3*d3 + 4*d4 + 5*d5 + 6*d6) * 1.0 / tosses;
		System.out.println("Average: " + avg);
        // End of code.
    }

}
