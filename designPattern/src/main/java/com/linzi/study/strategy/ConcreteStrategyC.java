package com.linzi.study.strategy;

/**
 * com.linzi.study.strategy.ConcreteStrategyC
 *
 * @Description: 具体策略类C
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/4
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void  algorithmInterface() {
        //相关的业务
        System.out.println("策略C执行了");
    }

}