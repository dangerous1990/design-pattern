package org.dangerous.pattern.build.singleton;

/**
 * 懒加载：true
 * 线程安全：true
 * 互斥锁影响性能
 * Created by Administrator on 2016/12/9.
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
