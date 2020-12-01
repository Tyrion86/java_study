package com.tyrion.design_pattern.single;

/**
 * 懒汉式单例模式（使用时再检查是否有实例）
 */
public class single_2 {
    private single_2(){
        System.out.println(Thread.currentThread().getName()+" run");
    }

    private volatile static single_2 SINGLE_2;

    //普通懒汉式
//    public static single_2 getInstance(){
//        if(SINGLE_2==null){
//            SINGLE_2=new single_2();
//        }
//        return SINGLE_2;
//    }

    //双重检测锁模式 DCL懒汉式
    public static single_2 getInstance(){
        if(SINGLE_2==null){
            synchronized (single_2.class){
                if (SINGLE_2==null){
                    SINGLE_2=new single_2();
                }
            }
        }
        //注意：new不是一个原子性操作
        /**
         * 1.分配内存空间
         * 2.执行构造方法
         * 3.把对象指向内存空间
         *
         * 事实上，可能出现指令重排的现象，期望执行顺序是123，但实际执行的顺序可能是132
         * 线程A执行到13时，线程B对SINGLE_2判断已经不为空，会直接return，但此时SINGLE_2还未进行构造
         * 所以要给SINGLE_2加上volatile（可以避免指令重排）
         */
        return SINGLE_2;
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->{
                single_2.getInstance();
            }).start();
        }
    }
}
