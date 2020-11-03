package com.example.game.demo3;

/**
 * @Description： 子弹类：是飞行物体
 * @Author：GuoFeng
 * @CreateTime：2020-11-03
 */
public class Bullet extends FlyingObject {
    /**
     * 移动的速度
     */
    private int speed = 3;

    /**
     * 初始化数据
     */
    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
        this.image = ShootGame.bullet;
    }

    /**
     * 移动
     */
    @Override
    public void step() {
        y -= speed;
    }

    /**
     * 越界处理
     */
    @Override
    public boolean outOfBounds() {
        return y < -height;
    }

}
