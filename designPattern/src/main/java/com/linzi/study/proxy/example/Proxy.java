package com.linzi.study.proxy.example;

/**
 * com.linzi.study.proxy.example.BuyMobileProxy
 *
 * @Description: 代理类
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/11
 */
public class Proxy implements Buy {
    private Buy buy;

    public Proxy(Buy buy) {
        this.buy = buy;
    }

    @Override
    public void buyMobile() {
        System.out.println("买手机前");
        buy.buyMobile();
        System.out.println("买手机后");
    }
}
