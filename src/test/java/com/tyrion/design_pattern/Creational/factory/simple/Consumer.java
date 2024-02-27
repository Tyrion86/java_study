package com.tyrion.design_pattern.Creational.factory.simple;

public class Consumer {
    public static void main(String[] args) {
        //通过工厂获取
        Car audi = CarFactory.getCar("Audi");
        Car tesla = CarFactory.getCar("Tesla");

        audi.name();
        tesla.name();
    }
}
