package com.exe.demo;

/**
 * 这个类专门用来实现单例模式
 */
public class Singleton {

    //定义一个Singleton类型的属性，为对象instance
    private static volatile Singleton instance;

    private Singleton(){
        //给一个私有的空参构造方法，使不能通过new的方式进行对象的创建
    }

    //给定一个get方法，进行外界的获取对象实例的路径
    public static Singleton getInstance() {
        //先做一个非空判断，如果当前类中含有instance对象，就不去抢锁，省的被堵塞，占用系统资源
        if (instance == null) {
            //如果当前类中instance对象为空，则进行锁的抢占
            synchronized (Singleton.class){
                //使用synchronized ()锁保证只有一个线程能够进入方法中，
                // 能去创建对象，保证单例的实现
            if (instance == null) {
                //再做一次非空判断,如果结果为空，则进行对象的创建，然后在方法的后面进行对象的返回
                instance = new Singleton();
            }
        }
    }
        return instance;
    }
}
