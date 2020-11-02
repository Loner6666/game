package com.example.game.demo1;

/**
 * @Description： 剪刀石头布游戏，电脑玩家（机器人）
 * @Author：GuoFeng
 * @CreateTime：2020-11-02
 */
public class Computer {

    int computer;

    public int Hand() {
        int computer = (int) ((Math.random() * 10) % 3 + 1);
        switch (computer) {
            case 1:
                System.out.println("电脑 出石头");
                break;
            case 2:
                System.out.println("电脑 出剪刀");
                break;
            case 3:
                System.out.println("电脑 出布");
                break;
        }
        return computer;
    }

}
