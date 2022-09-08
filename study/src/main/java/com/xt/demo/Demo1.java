package com.xt.demo;

/**
 * @author XT
 * @create 2022/9/8 22:17
 */
public class Demo1 {
    public static void main(String[] args) {
        test();
        System.out.println("world");
        System.out.println("world");
    }

    public static void test() {
        for (int i = 0; i < 5; i++) {
            System.out.println("我来改改");
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("make some noise ");
        }
    }

}
