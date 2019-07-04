package com.linzi.study.factory;

/**
 * com.mytongche.uc.factory.SimpleFactory
 *
 * @Description:
 * @Version: 1.0
 * @author: linzi
 * @date: 2019-07-03
 */
public class SimpleFactory {
    public Car getCar(String name) {
        if (name.equals("BWN")) {
            return new Bwm();
        } else if (name.equals("Benz")) {
            return new Benz();
        } else {
            System.out.println("这个车不生产");
            return null;
        }
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("BWN");
        System.out.println(car.getName());
    }
}
