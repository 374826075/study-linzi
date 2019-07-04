package com.linzi.study.factory;

/**
 * com.mytongche.uc.factory.BenzFactory
 *
 * @Description: 奔驰工厂
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-03
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCat() {
        return new Benz();
    }
}
