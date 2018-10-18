package com.emma.week7;

import java.util.Scanner;

public class Exercise1 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Exercise1().run();
    }

    public void run() {
        // չʾ�˵�
        showMenu();
        // ��ȡ�û�����,ֱ������Ϸ�ֵ
        String input = getUserInput();
        switch (input) {
            case "1":
                addUser();
            case "2":
                selectRandomUser();
            case "3":
                showTurns();
            default:
                System.out.println("Exiting program!");
                System.exit(0);
        }
    }

    // չʾ�˵�
    private void showMenu() {
        System.out.println("****** Random Roger! ******");
        System.out.println("* 1) Add users (max 10)   *");
        System.out.println("* 2) Select random user   *");
        System.out.println("* 3) Show turns           *");
        System.out.println("* 0) Exit                 *");
        System.out.println("***************************");
    }

    // ��ȡ�û�����
    private String getUserInput() {
        System.out.print("Make a selection from the menu:");
        String input = scanner.next();
        // ������Ч��У�飬���Բ�����
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("[0-3]{1}");
        while (!p.matcher(input).matches()) {
            System.out.println("That is invalid input. Try again:");
            input = scanner.next();
        }
        return input;
    }

    private void showTurns() {
        // TODO:������
        System.out.println("Show Turns");
        System.out.println("Task completed! Returning to main menu.");
        run();
    }

    private void selectRandomUser() {
        // TODO:������
        System.out.println("Select random user");
        System.out.println("Task completed! Returning to main menu.");
        run();
    }

    private void addUser() {
        // TODO:������
        System.out.println("Add users (max 10)");
        System.out.println("Task completed! Returning to main menu.");
        run();
    }

}
