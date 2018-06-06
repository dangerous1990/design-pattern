package org.dangerous.pattern.build.singleton;

/**
 * 静态内部类实现延迟初始化
 * Created by Administrator on 2016/12/9.
 */
public class Singleton6 {
    private Singleton6() {
    }

    private static class InternalSingleton {
        static final Singleton6 singleton6 = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return InternalSingleton.singleton6;
    }

}
