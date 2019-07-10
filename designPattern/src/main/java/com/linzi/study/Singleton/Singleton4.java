package com.linzi.study.Singleton;

/**
 * com.linzi.study.Singleton.Singleton4
 *
 * @Description: 单例模式4  静态内部类实现模式（线程安全，调用效率高，可以延时加载）
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class Singleton4 {

    private static class SingletoInstance {
        private static final Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletoInstance.instance;
    }

    private void show(){
        System.out.println("来了老弟2");
    }

    public static void main(String[] args) {
        Singleton4 instance4 = Singleton4.getInstance();
        instance4.show();
    }

}

