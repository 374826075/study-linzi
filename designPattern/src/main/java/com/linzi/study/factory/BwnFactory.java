package com.linzi.study.factory;

/**
 * com.mytongche.uc.factory.BwnFactory
 *
 * @Description:
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-03
 */
public class BwnFactory implements Factory {
    @Override
    public Car getCat() {
        return new Bwm();
    }
}
