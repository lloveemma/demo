package com.emma.week7;

import java.util.Scanner;

public class Exercise1 {

    Scanner scanner = new Scanner(System.in);
    // 记录用户
    String[] users = {};
    // 记录选中次数
    int[] turns = {};

    public static void main(String[] args) {
        new Exercise1().run();
    }

    public void run() {
        // 展示菜单
        showMenu();
        // 获取用户输入,直到输入合法值
        String input = getUserInput();
        if ("1".equals(input)) {
            addUser();
        } else if ("2".equals(input)) {
            selectRandomUser();
        } else if ("3".equals(input)) {
            showTurns();
        } else if ("0".equals(input)) {
            exit();
        }
        // 回主菜单 back to Menu
        backToMenu();
    }

    /**
     * show Menu
     */
    private void showMenu() {
        System.out.println("****** Random Roger! ******");
        System.out.println("* 1) Add users (max 10)   *");
        System.out.println("* 2) Select random user   *");
        System.out.println("* 3) Show turns           *");
        System.out.println("* 0) Exit                 *");
        System.out.println("***************************");
    }

    /**
     * get user input value
     * 
     * @return user input value
     */
    private String getUserInput() {
        System.out.print("Make a selection from the menu:");
        String input = scanner.nextLine();
        // 校验
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("[0-3]{1}");
        while (!p.matcher(input).matches()) {
            System.out.print("That is invalid input. Try again:");
            input = scanner.nextLine();
        }
        return input;
    }

    /**
     * add user based on user input.
     */
    private void addUser() {
        System.out.print("How many users do we have?  ");
        int count = scanner.nextInt();
        System.out.println("OK! Let's add " + count + " users!");
        users = new String[count];
        turns = new int[count];
        for (int i = 0; i < users.length; i++) {
            System.out.print("Enter the name of user " + (i + 1) + ":");
            String name = scanner.next();
            users[i] = name;
        }
        System.out.println("Names added!");
    }

    /**
     * select random user
     */
    private void selectRandomUser() {
        if (users.length > 0) {
            int num = new java.util.Random().nextInt(users.length);
            turns[num] += 1;// 次数加1
            System.out.println(users[num] + " was chosen!");
        }
    }

    /**
     * show Turns
     */
    private void showTurns() {
        System.out.println("******** Turns ********");
        for (int i = 0; i < users.length; i++) {
            System.out.println("* [" + turns[i] + "] " + users[i]);
        }
        System.out.println("***********************");
    }

    /**
     * back to Menu
     */
    private void backToMenu() {
        System.out.println();
        System.out.println("Task completed! Returning to main menu.");
        System.out.println();
        run();
    }

    /**
     * exit running
     */
    private void exit() {
        System.out.println();
        System.out.println("Exiting program!");
        System.exit(0);
    }

}
