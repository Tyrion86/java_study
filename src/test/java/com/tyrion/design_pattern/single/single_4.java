package com.tyrion.design_pattern.single;

// 线程安全的懒汉式单例
public class single_4 {

    // ThreadLocal 线程局部变量
    private static ThreadLocal<single_4> threadLocal = new ThreadLocal<single_4>();
    private static single_4 singleton4 = null;

    private single_4(){}

    public static single_4 getSingleton4(){
        if (threadLocal.get() == null) {        // 第一次检查：该线程是否第一次访问
            createSingleton4();
        }
        return singleton4;
    }

    public static void createSingleton4(){
        synchronized (single_4.class) {
            if (singleton4 == null) {          // 第二次检查：该单例是否被创建
                singleton4 = new single_4();   // 只执行一次
            }
        }
        threadLocal.set(singleton4);      // 将单例放入当前线程的局部变量中
    }
}