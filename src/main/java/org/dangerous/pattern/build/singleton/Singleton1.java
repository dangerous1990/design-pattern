package org.dangerous.pattern.build.singleton;

/**
 * 懒加载：true
 * 线程安全：fasle
 * Created by Administrator on 2016/12/9.
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}
