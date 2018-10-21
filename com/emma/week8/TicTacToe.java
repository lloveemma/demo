package com.emma.week8;

import java.util.Scanner;

public class TicTacToe {

    char[] pos = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    boolean[] hasPut = new boolean[pos.length];
    boolean gameOver = false;
    int winer = -1;
    Scanner scanner = new Scanner(System.in);;

    public static void main(String[] args) {
        new TicTacToe().run();
    }

    public void run() {
        draw();
        while (!gameOver) {
            play(1);
            play(2);
        }
    }

    public void play(int player) {
        while (!gameOver) {
            System.out.print("Player " + player + "'s move:");
            int input = scanner.nextInt();
            if (input < 1 || input > 9 || hasPut[input - 1]) {
                System.out.println("Invalid move!");
            } else {
                pos[input - 1] = player == 1 ? 'X' : 'O';
                hasPut[input - 1] = true;
                draw();
                checkWin();
                break;
            }
        }
    }

    private void checkWin() {
        //1,2,3 || 3,6,9 
        if ((pos[0] == pos[1] && pos[1] == pos[2]) || (pos[2] == pos[5] && pos[5] == pos[8])) {
            winer = pos[2] == 'X' ? 1 : 2;
        } else if ((pos[3] == pos[4] && pos[4] == pos[5]) || (pos[1] == pos[4] && pos[4] == pos[7])
                || (pos[0] == pos[4] && pos[4] == pos[8]) || (pos[2] == pos[4] && pos[4] == pos[6])) {
            winer = pos[4] == 'X' ? 1 : 2;
        } else if ((pos[6] == pos[7] && pos[7] == pos[8]) || (pos[0] == pos[3] && pos[3] == pos[6])) {
            winer = pos[6] == 'X' ? 1 : 2;
        } else {
            int count = 0;
            for (int i = 0; i < hasPut.length; i++) {
                if (hasPut[i]) {
                    count++;
                }
            }
            if (count == hasPut.length) {
                System.out.println("Game over! No one win!");
                gameOver = true;
            }
        }
        if (winer != -1) {
            System.out.println("Congrantulations! Player " + winer + ",you are the winer!");
            gameOver = true;
        }
    }

    private void draw() {
        String line = "";
        System.out.println();
        line = " " + pos[0] + " | " + pos[1] + " | " + pos[2];
        System.out.println(line);
        System.out.println("-----------");
        line = " " + pos[3] + " | " + pos[4] + " | " + pos[5];
        System.out.println(line);
        System.out.println("-----------");
        line = " " + pos[6] + " | " + pos[7] + " | " + pos[8];
        System.out.println(line);
        System.out.println();
    }
}
