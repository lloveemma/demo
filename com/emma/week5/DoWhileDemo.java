package com.emma.week5;

public class DoWhileDemo {

    public static void main(String[] args) {
        // 对于第一次循环 while是先判断再执行
        int i = 10;
        while (i < 10) {// 不成立
            System.out.println("例子一:" + i);// 不输出
            i++;
        }
        // 结果是什么都不打印,最终i的值为10

        // do-while是先执行,再判断
        i = 10;
        do {// 先执行一次
            System.out.println("例子二:" + i);
            i++;
        } while (i < 10);// 不成立

        // while 先判断条件是否成立，成立则执行，下面的j++ 是先使用j判断，然后加1 所以输出1次，值为1
        int j = 0;
        while (j++ < 1) {// j=0 <1 成立执行，然后j+1 = 1 输出 1
            System.out.println("例子三：" + j);
        }
        // do-while 先执行一次，再判断条件是否成立，成立则继续执行，直到条件不成立，所以输出2次
        j = 0;
        do { // j = 0, 输出0
            System.out.println("例子四：" + j);
        } while (j++ < 1);// j=0<1 成立，继续执行，j=j+1，输出1，然后j=1<1不成立，退出

        // for循环语句的执行流程：
        int count = 0;
        for (System.out.println("初始化语句A"); count < 2; System.out.println("循环后的语句C")) {
            System.out.println("循环体语句B");
            count++;
        }

        // for(;;) 相当于死循环 等价于 while(true)
        
    }

}
