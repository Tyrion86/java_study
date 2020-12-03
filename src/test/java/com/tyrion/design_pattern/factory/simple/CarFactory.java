package com.tyrion.design_pattern.factory.simple;

//静态工厂模式（通过接收不同的参数返回不同的实例）

public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("Audi")){
            return new Audi();
        }else if (car.equals("Tesla")){
            return new Tesla();
        }

        return null;
    }
}
