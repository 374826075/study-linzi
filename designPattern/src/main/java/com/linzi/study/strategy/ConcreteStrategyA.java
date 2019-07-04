package com.linzi.study.strategy;

/**
 * com.linzi.study.strategy.ConcreteStrategyA
 *
 * @Description: 具体策略类A
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/4
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void  algorithmInterface() {
        //相关的业务
        System.out.println("策略A执行了");
    }

}




