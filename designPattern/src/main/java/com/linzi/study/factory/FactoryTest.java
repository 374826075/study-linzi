package com.linzi.study.factory;

/**
 * com.mytongche.uc.factory.FactoryTest
 *
 * @Description: 简单工厂测试
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-03
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory bwn = new BwnFactory();
        Factory benz = new BenzFactory();
        System.out.println(bwn.getCat().getName());
        System.out.println(benz.getCat().getName());
    }
}
