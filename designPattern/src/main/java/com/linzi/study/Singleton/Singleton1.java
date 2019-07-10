package com.linzi.study.Singleton;

/**
 * com.linzi.study.Singleton.Singleton1
 *
 * @Description: 单例模式1 饿汉式(线程安全，调用效率高，但是不能延时加载)
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    private void show() {
        System.out.println("来了老弟");
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        instance1.show();
    }

}
