package com.emma.week5;

import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        new Exercise9().run();
    }

    public void run() {
        // Your code goes below this line.
        int[] codes = new int[4];
        // 从1-6选择
        int bound = 6;

        java.util.Random random = new java.util.Random();
        // 初始化数组，从1-6中随机取4个值
        for (int i = 0; i < codes.length; i++) {
            codes[i] = random.nextInt(bound) + 1;
        }
        System.out.println("The code has been generated! The game is on!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // 循环10次，如果没有猜中则结束游戏，退出
        for (int i = 1; i <= 10; i++) {
            System.out.println("Round #" + i);
            System.out.print("Please enter the code: ");
            String input = scanner.nextLine();
            int count = 0;// 猜对数字个数
            for (int j = 0; j < input.length(); j++) {
                // 转换为字符串，比较是否相同
                if (String.valueOf(input.charAt(j)).equals(String.valueOf(codes[j]))) {
                    count++;
                }
            }
            // 4个都对则结束游戏
            if (count == codes.length) {
                System.out.println("Congratulations! you win!");
                break;
            } else {
                System.out.println("Incorrect code! " + count + " numbers of the code are correct.");
            }
        }
        scanner.close();
        System.out.println("Game over! The code is: " + Arrays.toString(codes));
        // End of code.
    }

}
