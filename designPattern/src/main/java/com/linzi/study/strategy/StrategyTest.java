package com.linzi.study.strategy;

/**
 * com.linzi.study.strategy.StrategyTest
 *
 * @Description: 策略测试
 * @Version: 1.0
 * @author: linzi
 * @date: 2019/7/4
 */
public class StrategyTest {


    public static void main(String[] args) {
        Strategy s = new ConcreteStrategyA();
        Context context = new Context(s);
        context.contextInterface();
    }
}
