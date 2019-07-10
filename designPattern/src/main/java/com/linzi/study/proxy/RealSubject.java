package com.linzi.study.proxy;

/**
 * com.linzi.study.proxy.RealSubject
 *
 * @Description: 真实主题类
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-10
 */
public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("我要买吃的");
    }
}
