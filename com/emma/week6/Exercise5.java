package com.emma.week6;

public class Exercise5 {

    public static void main(String[] args) {
        new Exercise5().run();
    }

    public void run() {
        System.out.println("Welcome to the pyramid drawing application!");

        int menuSelection = -1;

        while(menuSelection != 0) {
            printMenu();

            System.out.print("Make a selection from the menu: ");
            menuSelection = readIntFromUserBetweenBounds(0,4);

            if(menuSelection == 1) {
                drawPyramidWithHeight(3);
            } else if(menuSelection == 2) {
                drawPyramidWithHeight(10);
            } else if(menuSelection == 3) {
                System.out.print("Enter the height of the pyramid (1 - 99): ");
                int pyramidHeight = readIntFromUserBetweenBounds(0,100);
                drawPyramidWithHeight(pyramidHeight);
            } else {
                System.out.println("Exiting program!");
            }

            System.out.println();
        }
    }

    private int readIntFromUserBetweenBounds(int start, int end) {
        int n = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        n = sc.nextInt();
        if (n > start && n < end) {
            return n;
        }
        return 0;
    }
    
    private void drawPyramidWithHeight(int height) {
     // System.out.println("Full Pyramid: ");
        for (int i = 1; i <= height; i++) {
            // 每行输出 高度-当前行数 个空格
            for (int j = 0; j < height - i; j++)
                System.out.print(" ");
            // 每行输出 当前行数*2-1 个空格，如第一行 1*2-1 = 1，第二行2*2-1=3
            for (int k = 0; k < i * 2 - 1; k++)
                System.out.print("#");
            // 输出换行
            System.out.println();
        }
    }

    public void printMenu() {
        System.out.println("======================================");
        System.out.println("+ 1) Draw a pyramid with height 3    +");
        System.out.println("+ 2) Draw a pyramid with height 10   +");
        System.out.println("+ 3) Draw a pyramid of custom height +");
        System.out.println("+ 0) Exit program                    +");
        System.out.println("======================================");
    }

}
