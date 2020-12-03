package com.tyrion.design_pattern.factory.method;

public class AudiFactory implements Factory{

    @Override
    public Car getCar() {
        return new Audi();
    }
}
