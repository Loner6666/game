package com.example.game.demo1;

import java.util.Scanner;

/**
 * @Description： 剪刀石头布游戏，游戏玩家（你自己）
 * @Author：GuoFeng
 * @CreateTime：2020-11-02
 */
public class Person {

    String personame;
    int person;


    public int ShowHand() {
        Scanner s = new Scanner(System.in);
        System.out.println("请出拳：1.石头  2.剪刀  3.布");
        int person = s.nextInt();
        switch (person) {
            case 1:
                System.out.println(personame + " 出石头");
                break;
            case 2:
                System.out.println(personame + " 出剪刀");
                break;
            case 3:
                System.out.println(personame + " 出布");
                break;
        }
        return person;
    }

}
