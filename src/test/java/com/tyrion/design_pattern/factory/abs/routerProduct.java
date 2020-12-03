package com.tyrion.design_pattern.factory.abs;

//路由器产品接口
public interface routerProduct {
    void start();
    void shutdown();
    void openWifi();
    void setting();
}
