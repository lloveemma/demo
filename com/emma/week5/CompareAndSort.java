package com.emma.week5;

import java.util.Arrays;

public class CompareAndSort {

    public static void main(String[] args) {
        // 初始化数组
        int[] a = { 3, 2, 5, 7, 1, 9, 6, 4 };

        // 取最大值
        // 方法1：逐个比较，如果下一个值比当前值大则取下一个值
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("input: " + Arrays.toString(a));
        System.out.println("max is: " + max);

        // 方法2：排序后取最后一个, Arrays.sort方法，默认升序，排序后数组会改变顺序
        Arrays.sort(a);
        System.out.println("input: " + Arrays.toString(a));
        System.out.println("max is: " + a[a.length - 1]);
    }

}
