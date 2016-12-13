package org.dangerous.pattern.build.singleton;

/**
 * 懒加载：false
 * 线程安全：true
 * Created by Administrator on 2016/12/9.
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
