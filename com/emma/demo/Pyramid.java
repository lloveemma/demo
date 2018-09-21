package com.emma.demo;

import java.util.Scanner;

public class Pyramid {
    /*
     * ����Scanner
     */
    private static Scanner scanner;
    /*
     * ����ʹ�÷��ţ������Լ�����
     */
    private static String symbol = "#";

    /**
     * ��ӡ�Ҳ������
     * 
     * @param height
     *            �������߶�
     */
    public void rightPyramid(int height) {
        // System.out.println("Right Pyramid: ");
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                // ÿ�������ǰ�и�����
                System.out.print(symbol);
            }
            // �������
            System.out.println();
        }
    }

    /**
     * ��ӡ��������
     * 
     * @param height
     *            �������߶�
     */
    public void leftPyramid(int height) {
        // System.out.println("Left Pyramid: ");
        for (int i = 1; i <= height; i++) {
            // ÿ����� �߶�-��ǰ���� ���ո�
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            // ÿ�������ǰ�и�����
            for (int k = 0; k < i; k++)
                System.out.print(symbol);
            // �������
            System.out.println();
        }
    }

    /**
     * ��ӡȫ��������
     * 
     * @param height
     *            �������߶�
     */
    public void fullPyramid(int height) {
        // System.out.println("Full Pyramid: ");
        for (int i = 1; i <= height; i++) {
            // ÿ����� �߶�-��ǰ���� ���ո�
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            // ÿ����� ��ǰ����*2-1 ���ո����һ�� 1*2-1 = 1���ڶ���2*2-1=3
            for (int k = 0; k < i * 2 - 1; k++)
                System.out.print(symbol);
            // �������
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        System.out.print("Heigth? ");
        scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        // ����100�����
        if (height > 0 && height < 100) {
            //pyramid.rightPyramid(height);
            //pyramid.leftPyramid(height);
            pyramid.fullPyramid(height);
        }
    }
}