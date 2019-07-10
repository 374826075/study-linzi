package com.linzi.study.proxy;

/**
 * com.linzi.study.proxy.Proxy
 *
 * @Description: 代理主题类
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class Proxy implements Subject {
    /**
     * 维持一个对真实主题对象的引用
     */
    private RealSubject realSubject = new RealSubject();

    public void PreRequest() {
        System.out.println("买汉堡");
    }

    public void PostRequest() {
        System.out.println("买可乐");
    }

    @Override
    public void Request() {
        realSubject.Request(); //调用真实主题对象的方法
        PreRequest();
        PostRequest();
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
