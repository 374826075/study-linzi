package com.linzi.study.proxy.example;

/**
 * com.linzi.study.proxy.example.ProxyTest
 *
 * @Description: 测试类
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/11
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Person());
        proxy.buyMobile();
    }
}
