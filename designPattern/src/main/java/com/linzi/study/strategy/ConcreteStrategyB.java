package com.linzi.study.strategy;

/**
 * com.linzi.study.strategy.ConcreteStrategyB
 *
 * @Description: 具体策略类B
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/4
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void  algorithmInterface() {
        //相关的业务
        System.out.println("策略B执行了");
    }

}
