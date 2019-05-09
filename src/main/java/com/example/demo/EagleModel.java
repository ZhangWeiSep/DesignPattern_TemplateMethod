package com.example.demo;

/**
 * @pathName：EagleModel
 * @author：ZhangWei
 */
public abstract class EagleModel {

    /**
     * 开始
     */
    abstract void start();

    /**
     * 飞翔
     */
    abstract void fly();

    /**
     * 发出叫声
     */
    abstract void call();

    /**
     * 停止
     */
    abstract void stop();

    /**
     * 开始行动
     * 这里模板方法加入final修饰，防止被覆写
     */
    final public void move() {
        this.start();
        this.fly();
        this.call();
        this.stop();
    }

}
