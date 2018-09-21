package com.emma.demo;

import java.util.Scanner;

public class Pyramid {
    /*
     * 定义Scanner
     */
    private static Scanner scanner;
    /*
     * 定义使用符号，可以自己调整
     */
    private static String symbol = "#";

    /**
     * 打印右侧金字塔
     * 
     * @param height
     *            金字塔高度
     */
    public void rightPyramid(int height) {
        // System.out.println("Right Pyramid: ");
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                // 每行输出当前行个符号
                System.out.print(symbol);
            }
            // 输出换行
            System.out.println();
        }
    }

    /**
     * 打印左侧金字塔
     * 
     * @param height
     *            金字塔高度
     */
    public void leftPyramid(int height) {
        // System.out.println("Left Pyramid: ");
        for (int i = 1; i <= height; i++) {
            // 每行输出 高度-当前行数 个空格
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            // 每行输出当前行个符号
            for (int k = 0; k < i; k++)
                System.out.print(symbol);
            // 输出换行
            System.out.println();
        }
    }

    /**
     * 打印全部金字塔
     * 
     * @param height
     *            金字塔高度
     */
    public void fullPyramid(int height) {
        // System.out.println("Full Pyramid: ");
        for (int i = 1; i <= height; i++) {
            // 每行输出 高度-当前行数 个空格
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            // 每行输出 当前行数*2-1 个空格，如第一行 1*2-1 = 1，第二行2*2-1=3
            for (int k = 0; k < i * 2 - 1; k++)
                System.out.print(symbol);
            // 输出换行
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        System.out.print("Heigth? ");
        scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        // 超过100则不输出
        if (height > 0 && height < 100) {
            //pyramid.rightPyramid(height);
            //pyramid.leftPyramid(height);
            pyramid.fullPyramid(height);
        }
    }
}