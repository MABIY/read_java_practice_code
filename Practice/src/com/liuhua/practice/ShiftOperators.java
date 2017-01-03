package com.liuhua.practice;

/**
 * Created by lh on 16-12-29.
 */
public class ShiftOperators {
    public static void main(String[] args) {
        // ShiftOperator of  <<
        System.out.println(Integer.toBinaryString(5<<2));
        System.out.println(Integer.toBinaryString(5 << 29));
        System.out.println(5<<29);
        System.out.println(Integer.toBinaryString(5 << 30));
        System.out.println(5<<30);
        System.out.println(Integer.toBinaryString(5 << 31));
        System.out.println(5<<31);
        System.out.println(Integer.toBinaryString(5 << 32));
        System.out.println(5<<32);

        // ShiftOperator of  <<
        System.out.println(Integer.toBinaryString(5>>2));
        System.out.println(Integer.toBinaryString(5 >> 29));
        System.out.println(5>>29);
        System.out.println(Integer.toBinaryString(5 >> 30));
        System.out.println(5>>30);
        System.out.println(Integer.toBinaryString(5 >> 31));
        System.out.println(5>>31);
        System.out.println(Integer.toBinaryString(5 >> 32));
        System.out.println(5>>32);

        // ShiftOperator of  >>>
        System.out.println(Integer.toBinaryString(-5));
        System.out.println((5));
        System.out.println(Integer.toBinaryString(-5>>>3));
        System.out.println((-5 >>> 3));
        System.out.println(Integer.toBinaryString(-5>>>30));
        System.out.println(-5>>>30);
        System.out.println(Integer.toBinaryString(-5>>>31));
        System.out.println((-5>>31));
        System.out.println(Integer.toBinaryString(-5>>>32));
        System.out.println((-5>>32));

    }
}