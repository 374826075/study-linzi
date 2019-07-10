package com.linzi.study.Singleton;

/**
 * com.linzi.study.Singleton.Singleton3
 *
 * @Description: 单例模式3  Double CheckLock实现单例：DCL也就是双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class Singleton3 {
    private volatile static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    private void show(){
        System.out.println("来了老弟2");
    }

    public static void main(String[] args) {
        Singleton3 instance3 = Singleton3.getInstance();
        instance3.show();
    }
}
