package com.emma.week5;

public class Exercise1_v2 {

    public static void main(String[] args) {
        new Exercise1_v2().run();
    }

    public void run() {
        // Your code goes below this line.

        // Step 1: Define a character array with 9 fields.
        char[] pos = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        // Step 2: Print the fields in the right layout.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Input a field (1-9): ");
            int field = scanner.nextInt();
            // ���滻ԭʼ���飬ֱ����ָ��λ�����X
            for (int i = 0; i < pos.length; i++) {
                if (i + 1 == field) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" " + pos[i] + " ");
                }
                // ÿ3�����ֺ����һ�ηָ���
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                    // ���һ�в����
                    if (i != pos.length - 1) {
                        System.out.println("-----------");
                    }
                } else {
                    System.out.print("|");
                }
            }
            // ���ڷ�Χ�ڣ��˳�
            if (field < 1 || field > 9) {
                scanner.close();
                break;
            }
        }
        // End of code.
    }

}
