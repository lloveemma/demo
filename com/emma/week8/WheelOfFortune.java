package com.emma.week8;

import java.util.Random;
import java.util.Scanner;

public class WheelOfFortune {
    private Scanner scanner;
    private String quiz = "";
    private String[] geussed;
    private String invaild_inputs = "";
    private boolean gameOver = false;
    private int players = 3;
    // 0 : BANKRUPT, 1 : LOSE A TURN
    private int[] amounts = { 0, 1, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500,
            1600, 1700, 1800, 1900, 2000 };
    // default value 0;
    private int[] money = new int[players];

    public static void main(String[] args) {
        new WheelOfFortune().run();
    }

    private void run() {
        initGame();
        startGame();
    }

    private void startGame() {
        System.out.println("Let the game begin!");
        while (!gameOver) {
            for (int i = 1; i <= players; i++) {
                play(i);
            }
        }
    }

    private void play(int player) {
        while (!gameOver) {
            showProgess();
            showMenu(player);
            String selectMenu = getStringInput();
            if (selectMenu.equals("1")) {
                guessLetter(player);
                break;
            } else if (selectMenu.equals("2")) {
                guessSolution(player);
                break;
            } else {
                System.out.println("Invalid input, try again!");
            }
        }
    }

    private void guessSolution(int player) {
        System.out.println("Your guess?");
        String solution = getStringInput();
        if (quiz.equals(solution)) {
            System.out.println("Congratulations! You have guessed correctly.");
            System.out.println("Game over! Player " + player + " won the game and earned $" + money[player - 1] + ".");
            gameOver = true;
        } else {
            System.out.println("Sorry, that¡¯s not correct!");
        }
    }

    private void guessLetter(int player) {
        System.out.println("Spinning the wheel!");
        int amount = getWheelMoney();
        if (amount == 0) {
            System.out.println("Oh no! The wheel ended on BANKRUPTCY! You lose all your money!");
            money[player - 1] = 0;
        } else if (amount == 1) {
            System.out.println("Bad luck! The wheel ended on LOSE A TURN! Your turn is lost.");
        } else {
            System.out.println("The arrow landed on $" + amount + ".");
            String letter = "";
            while (letter.length() != 1) {
                System.out.print("Please enter a letter: ");
                letter = getStringInput();
                if (letter.length() == 1) {
                    int count = find(letter);
                    if (count > 0) {
                        System.out.println("That letter exists " + count + " time(s) in the solution.");
                        int earned_money = count * amount;
                        System.out.println("You have earned $" + earned_money + ".");
                        money[player - 1] += earned_money;
                        checkWin(player);
                    } else {
                        System.out.println("That letter does not occur in the solution (anymore).");
                    }
                    break;
                } else {
                    System.out.println("Invalid input, try again!");
                }
            }
        }
    }

    /**
     * check if the player win.
     * @param player
     */
    private void checkWin(int player) {
        boolean win = true;
        for (int i = 0; i < geussed.length; i++) {
            if (geussed[i].equals("_")) {
                win = false;
                break;
            }
        }
        if (win) {
            System.out.println("Congratulations! You have guessed correctly.");
            System.out.println("Game over! Player " + player + " won the game and earned $" + money[player - 1] + ".");
            gameOver = true;
        }
    }

    /**
     * find if the letter is in the quiz, if yes marked and put this letter already use.
     * @param letter
     * @return count
     */
    private int find(String letter) {
        int count = 0;
        for (int i = 0; i < invaild_inputs.length(); i++) {
            if (invaild_inputs.charAt(i) == letter.charAt(0)) {
                return count;
            }
        }
        for (int i = 0; i < quiz.length(); i++) {
            if (quiz.charAt(i) == letter.charAt(0)) {
                count++;
                geussed[i] = letter;
                invaild_inputs += letter;
            }
        }
        return count;
    }

    private int getWheelMoney() {
        Random r = new Random();
        return amounts[r.nextInt(amounts.length)];
    }

    private void showMenu(int player) {
        System.out.println("-- Player " + player + "¡¯s turn...");
        System.out.println("Your options:");
        System.out.println("1) Turn the wheel and guess a letter.");
        System.out.println("2) Guess the solution");
        System.out.println("What would you like to do?");
    }

    /**
     * print current state
     */
    private void showProgess() {
        System.out.println("-------------------");
        for (int i = 0; i < money.length; i++) {
            System.out.println("-- Money earned by player " + (i + 1) + ": $" + money[i]);
        }
        System.out.print("The solution so far: ");
        for (int i = 0; i < geussed.length; i++) {
            System.out.print(geussed[i]);
        }
        System.out.println();
    }

    /**
     * initial game
     */
    private void initGame() {
        System.out.println("Welcome to the Wheel of Fortune...");
        System.out.println("----------------------------------");
        System.out.println("Quizmaster, please provide a word or sentence that the players need to guess:");
        quiz = getStringInput();
        int len = quiz.length();
        geussed = new String[len];
        for (int i = 0; i < len; i++) {
            if (quiz.charAt(i) != ' ') {
                geussed[i] = "_";
            } else {
                geussed[i] = " ";
            }
        }
    }

    /**
     * get user input
     * 
     * @return input string
     */
    private String getStringInput() {
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }
}
