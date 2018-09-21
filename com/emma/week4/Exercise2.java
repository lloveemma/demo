package com.emma.week4;
public class Exercise2 {

    public static void main(String[] args) {
        new Exercise2().run();
    }

    public void run() {
        // Your code goes below this line.
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Step 1: Prompt for X coordinate
        System.out.print("What's the X coordinate? ");
        int x = scanner.nextInt();
        // Step 2: Prompt for Y coordinate
        System.out.print("What's the Y coordinate? ");
        int y = scanner.nextInt();
        // Step 2.5: (Optional) Print some borders.. <-- do this last!
        System.out.println("============");
        // Step 3: Create a loop for all vertical lines, starting at 0 till Y
        for (int i = 0; i < 5; i++) {
            System.out.print("+");
            // Step 4: Inside this loop, create another loop that starts at 0 till X
            for (int j = 0; j < 10; j++) {
                // Step 5: If the inputted X and Y coordinates match where you currently are, print an X.
                if (x == j && y == i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("+");
        }
        System.out.println("+==========+");
        scanner.close();
        // End of code.
    }

}
