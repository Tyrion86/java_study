package com.tyrion.design_pattern.single;

//静态内部类实现
public class single_3 {

    private single_3(){}

    public static single_3 getInstance(){
        return inner.SINGLE_3;
    }

    public static class inner{
        private static final single_3 SINGLE_3=new single_3();

    }
}
