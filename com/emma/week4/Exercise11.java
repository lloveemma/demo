package com.emma.week4;

public class Exercise11 {

    public static void main(String[] args) {
        // ѭ����1~9
        for (int i = 1; i < 10; i++) {
            // ѭ����1~����
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");// \tΪ�Ʊ�����൱�ڰ�Tab����
            }
            //ÿ��һ������
            System.out.println();
        }
    }
}
