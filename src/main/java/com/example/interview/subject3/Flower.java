package com.example.interview.subject3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：水仙花数
 * @Author：GuoFeng
 * @CreateTime：2022-05-19
 */
public class Flower {
    public static void main(String[] args) {
        //水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），
        // 水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身。例如：1^3 + 5^3+ 3^3 = 153
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (a * a * a + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                list.add(i);
            }
        }
        System.out.println("水仙花数为：");
        list.forEach(item -> System.out.print(item + "\t"));
    }
}
