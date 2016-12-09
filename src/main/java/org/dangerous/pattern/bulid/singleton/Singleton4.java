package org.dangerous.pattern.bulid.singleton;

/**
 * 懒加载：false
 * 线程安全：true
 * Created by Administrator on 2016/12/9.
 */
public class Singleton4 {
    private static Singleton4 instance = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
