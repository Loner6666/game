package com.example.game.demo1;


import java.util.Scanner;

/**
 * @Description： 剪刀石头布游戏，启动类
 * @Author：GuoFeng
 * @CreateTime：2020-11-02
 */
public class Caiquan {

    public static void main(String[] args) {
        Person p = new Person();
        Computer c = new Computer();
        boolean flag = true;
        while (flag) {
            System.out.println("剪刀石头布游戏开始，请输入自己的名字:");
            Scanner s = new Scanner(System.in);
            p.personame = s.next();
            int person = p.ShowHand();
            int computer = c.Hand();
            if ((person == 1 && computer == 2) || (person == 2 && computer == 3) || (person == 3 && computer == 1)) {
                System.out.println("你赢了！");
            } else if ((person == 1 && computer == 1) || (person == 2 && computer == 2) || (person == 3 && computer == 3)) {
                System.out.println("平局!");
            } else {
                System.out.println("Computer赢了！");
            }
            System.out.println("是否继续下一轮：Y / N");
            String YesOrNo = s.next();
            if (YesOrNo.equals("Y") || YesOrNo.equals("y")) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println("游戏结束！");
    }


}
