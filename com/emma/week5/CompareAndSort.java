package com.emma.week5;

import java.util.Arrays;

public class CompareAndSort {

    public static void main(String[] args) {
        // ��ʼ������
        int[] a = { 3, 2, 5, 7, 1, 9, 6, 4 };

        // ȡ���ֵ
        // ����1������Ƚϣ������һ��ֵ�ȵ�ǰֵ����ȡ��һ��ֵ
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("input: " + Arrays.toString(a));
        System.out.println("max is: " + max);

        // ����2�������ȡ���һ��, Arrays.sort������Ĭ����������������ı�˳��
        Arrays.sort(a);
        System.out.println("input: " + Arrays.toString(a));
        System.out.println("max is: " + a[a.length - 1]);
    }

}
