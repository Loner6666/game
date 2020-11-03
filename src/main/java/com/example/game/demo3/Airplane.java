package com.example.game.demo3;

import java.util.Random;

/**
 * @Description： 敌飞机: 是飞行物，也是敌人
 * @Author：GuoFeng
 * @CreateTime：2020-11-03
 */
public class Airplane extends FlyingObject implements Enemy {
    /**
     * 移动步骤
     */
    private int speed = 3;

    /**
     * 初始化数据
     */
    public Airplane() {
        this.image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH - width);
    }

    /**
     * 获取分数
     */
    @Override
    public int getScore() {
        return 5;
    }

    /**
     * 越界处理
     */
    @Override
    public boolean outOfBounds() {
        return y > ShootGame.HEIGHT;
    }

    /**
     * 移动
     */
    @Override
    public void step() {
        y += speed;
    }

}
