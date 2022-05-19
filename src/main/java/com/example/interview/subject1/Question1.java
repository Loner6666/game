package com.example.interview.subject1;

/**
 * @Description：九九乘法表
 * @Author：GuoFeng
 * @CreateTime：2022-05-19
 */
public class Question1 {
    public static void main(String[] args) {
        getMethod1();
        getMethod2();
    }


    /**
     * 九九乘法表，方法一
     */
    private static void getMethod1() {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    /**
     * 九九乘法表，方法二
     */
    private static void getMethod2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }

}
