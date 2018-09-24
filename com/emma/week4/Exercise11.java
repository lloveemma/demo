package com.emma.week4;

public class Exercise11 {

    public static void main(String[] args) {
        // 循环行1~9
        for (int i = 1; i < 10; i++) {
            // 循环列1~行数
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");// \t为制表符（相当于按Tab键）
            }
            //每行一个换行
            System.out.println();
        }
    }
}
