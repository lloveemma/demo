package com.emma.week5;

import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        new Exercise9().run();
    }

    public void run() {
        // Your code goes below this line.
        int[] codes = new int[4];
        // ��1-6ѡ��
        int bound = 6;

        java.util.Random random = new java.util.Random();
        // ��ʼ�����飬��1-6�����ȡ4��ֵ
        for (int i = 0; i < codes.length; i++) {
            codes[i] = random.nextInt(bound) + 1;
        }
        System.out.println("The code has been generated! The game is on!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // ѭ��10�Σ����û�в����������Ϸ���˳�
        for (int i = 1; i <= 10; i++) {
            System.out.println("Round #" + i);
            System.out.print("Please enter the code: ");
            String input = scanner.nextLine();
            int count = 0;// �¶����ָ���
            for (int j = 0; j < input.length(); j++) {
                // ת��Ϊ�ַ������Ƚ��Ƿ���ͬ
                if (String.valueOf(input.charAt(j)).equals(String.valueOf(codes[j]))) {
                    count++;
                }
            }
            // 4�������������Ϸ
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
