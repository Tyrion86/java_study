package com.tyrion.design_pattern.Creational.factory.abs;

public class HuaRouter implements routerProduct{
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
