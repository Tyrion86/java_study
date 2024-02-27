package com.tyrion.design_pattern.single;

// import org.junit.Test;

/**
 * 饿汉式单例模式（实例在初始化已经创建）
 * 存在问题：可能会浪费内存空间，例如类中有若干个较大的数组等等
 * 好处：不存在线程问题
 */

public class single_1 {
    private single_1(){}

    private final static single_1 SINGLE_1=new single_1();

    public static single_1 gerInstance(){
        return SINGLE_1;
    }

    //进行测试
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->System.out.println(single_1.gerInstance().hashCode())).start();
        }
    }
}


