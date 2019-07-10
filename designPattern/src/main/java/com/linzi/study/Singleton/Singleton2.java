package com.linzi.study.Singleton;

/**
 * com.linzi.study.Singleton.Singleton2
 *
 * @Description: 单例模式2 懒汉式(线程安全，调用效率不高，但是能延时加载)
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class Singleton2 {
    private static Singleton2 instance;
    /**
     * 方法同步,调用效率低
     *
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    private void show(){
        System.out.println("来了老弟2");
    }

    public static void main(String[] args) {
        Singleton2 instance2 = Singleton2.getInstance();
        instance2.show();
    }

}
