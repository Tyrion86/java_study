package com.tyrion.design_pattern.Creational.factory.abs;

//小米手机
public class Xiaomi implements phoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米发短信");
    }
}
