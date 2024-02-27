package com.tyrion.design_pattern.Creational.factory.method;

public class TeslaFactory implements Factory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
