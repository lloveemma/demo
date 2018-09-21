package com.emma.demo;

import java.util.Scanner;

/**
 * while 版本
 *
 */
public class Pyramid2 {
	private static Scanner scanner;

	public static void main(String[] args) {
		System.out.print("Heigth? ");
    	scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		scanner.close();
		int row = 0;
		// 遍历高度
		while (row++ < height) {
			int space = height - row;
			int symbol = row * 2 - 1;
			// 输出空格
			while (space-- > 0)
				System.out.print(" ");
			// 输出符号
			while (symbol-- > 0)
				System.out.print("#");

			System.out.println();
		}
	}
}
