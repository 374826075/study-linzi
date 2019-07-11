package com.linzi.study.proxy.example;

/**
 * com.linzi.study.proxy.example.BuyMobileImpl
 *
 * @Description: 真实主题类（人）
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/11
 */
public class Person implements Buy{

    @Override
    public void buyMobile() {
        System.out.println("我要买手机！");
    }
}
