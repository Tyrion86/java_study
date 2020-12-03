package com.tyrion.design_pattern.factory.method;

public class TeslaFactory implements Factory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
