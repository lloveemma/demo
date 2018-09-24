package com.emma.week4;

public class Exercise11 {

    public static void main(String[] args) {
        // 循环行1~9
        for (int i = 1; i < 10; i++) {
            // 循环列1~行数
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");// \t为制表符（相当于按Tab键）
            }
            // 每行一个换行
            System.out.println();
        }

        System.out.println("Welcome to the multiplication table trainer!");
        System.out.println();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please enter the first table that you want to train: ");
        int first = scanner.nextInt();
        System.out.print("Please enter the last table that you want to train: ");
        System.out.println();
        int last = scanner.nextInt();
        scanner.close();
        for (int i = first; i <= last; i++) {
            System.out.println("== Table of " + i + " == ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + "=" + i * j);
            }
            System.out.println();
        }

    }
}
