package com.example.game.demo3;

/**
 * @Description： 分数奖励
 * @Author：GuoFeng
 * @CreateTime：2020-11-03
 */
public interface Award {

    /**
     * 双倍火力
     */
    int DOUBLE_FIRE = 0;
    /**
     * 1条命
     */
    int LIFE = 1;

    /**
     * 获得奖励类型(上面的0或1)
     */
    int getType();

}
