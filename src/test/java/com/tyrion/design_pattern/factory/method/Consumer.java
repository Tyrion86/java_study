package com.tyrion.design_pattern.factory.method;

public class Consumer {
    public static void main(String[] args) {
        //通过汽车各自的工厂获取
        Car audi = new AudiFactory().getCar();
        Car tesla = new TeslaFactory().getCar();

        audi.name();
        tesla.name();
    }
}
