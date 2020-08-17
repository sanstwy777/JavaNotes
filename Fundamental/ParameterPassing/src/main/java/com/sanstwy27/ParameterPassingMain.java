package com.sanstwy27;

import java.util.Arrays;

/**
 * @author Sanstwy27
 * @create 8/17/2020
 */

public class ParameterPassingMain {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 2;
        int[] arr = {1,2,3,4,5};
        MyData my = new MyData();

        change(i, str, num, arr, my);

        System.out.println("i = " + i);
        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("my.a = " + my.a);

        /**
         * i = 1
         * str = hello
         * num = 2
         * arr = [2, 2, 3, 4, 5]
         * my.a = 11
         */
    }

    public static void change(int j, String s, Integer n, int[] a, MyData m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class MyData {
    int a = 10;
}
