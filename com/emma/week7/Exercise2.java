package com.emma.week7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    // all values
    int[] all_values = new int[20];
    int[] bingo_card = new int[5];
    // bingo set
    boolean hasSet = false;
    // indicate whether marked or not.
    boolean[] marked = new boolean[5];
    // turns
    int turns = 0;

    boolean win = false;
    private Scanner scanner;

    public static void main(String[] args) {
        new Exercise2().run();
    }

    public void run() {
        // initial and shuffle
        initAndShuffle();
        while (!win) {
            showMenu();
            System.out.print("Select a menu option: ");
            int input = getUserInput();
            if (1 == input) {
                creatBingoCard();
            } else if (2 == input) {
                drawNumber();
            } else if (3 == input) {
                checkBingoCard(true);
            } else if (9 == input) {
                exit();
            } else {
                System.out.println("Invalid input. Try again!");
            }
        }
    }

    public void initAndShuffle() {
        for (int i = 0; i < all_values.length; i++) {
            all_values[i] = i;
        }
        Random random = new Random();
        // 打乱 random 后面从这里面取值
        for (int i = 0; i < 100; i++) {
            int idx1 = random.nextInt(all_values.length);
            int idx2 = random.nextInt(all_values.length);
            int temp = all_values[idx1];
            all_values[idx1] = all_values[idx2];
            all_values[idx2] = temp;
        }
    }

    /**
     * Menu display
     */
    public void showMenu() {
        System.out.println("******************************************");
        System.out.println("* BINGO");
        System.out.println("******************************************");
        System.out.println("* 1) Create a Bingo card");
        System.out.println("* 2) Draw a number");
        System.out.println("* 3) Check Bingo card");
        System.out.println("* 9) Exit");
        System.out.println("******************************************");
    }

    /**
     * get user input value
     * 
     * @return user input value
     */
    private int getUserInput() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Create a Bingo card
     */
    private void creatBingoCard() {
        if (hasSet) {
            System.out.println("You have create a Bingo card!");
            return;
        }
        for (int i = 0; i < bingo_card.length; i++) {
            // keep running until get the correct input value
            while (true) {
                System.out.print("Enter a value for field " + (i + 1) + ":");
                int input = getUserInput();
                if (input >= 0 && input < 20) {
                    // check repeat
                    boolean repeat = false;
                    for (int card_value : bingo_card) {
                        if (input == card_value) {
                            // show repeat
                            repeat = true;
                            System.out.println("The number " + input
                                    + " is already on your Bingo card. Choose a different value.");
                            break;
                        }
                    }
                    if (!repeat) {
                        bingo_card[i] = input;
                        break;// exist "while" when get correct input.
                    }
                } else {
                    // show the error information
                    System.out.println("The entered value is too high! All values must be between 0 and 20.");
                }
            }
        }
        hasSet = true;
        // show bingo card
        System.out.println();
        System.out.println("Your Bingo card contains the numbers: " + Arrays.toString(bingo_card));
    }

    private void drawNumber() {
        if (!hasSet) {
            System.out.println();
            System.out.println("You must first create a Bingo card before drawing a number!");
            System.out.println();
            return;
        }
        // get random value
        int random_number = all_values[turns++];
        for (int i = 0; i < bingo_card.length; i++) {
            if (bingo_card[i] == random_number) {
                marked[i] = true;
            }
        }
        System.out.println("A number is drawn! The ball reads the number: " + random_number + "!");
        checkBingoCard(false);

    }

    private void printBingCard() {

        System.out.print("Your Bingo card: [ ");
        for (int i = 0; i < bingo_card.length; i++) {
            if (marked[i]) {
                System.out.print("(" + bingo_card[i] + ")");
            } else {
                System.out.print(bingo_card[i]);
            }

            if (i == bingo_card.length - 1) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * check bingo card, if win, exit.
     */
    private void checkBingoCard(boolean printNotBingo) {
        printBingCard();
        // all is marked, print bingo and exit else print message and continue
        if (checkWin()) {
            win = true;
            System.out.println("BINGO! All numbers are marked in " + turns + " turns.");
            exit();
        } else if (printNotBingo) {
            System.out.println("Unfortunately, you don't have Bingo yet!");
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < marked.length; i++) {
            if (!marked[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * exit running
     */
    private void exit() {
        System.exit(0);
    }
}
