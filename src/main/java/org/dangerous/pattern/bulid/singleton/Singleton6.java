package org.dangerous.pattern.bulid.singleton;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Singleton6 {
    private Singleton6() {

    }

    private static class Singleton7 {
        static final Singleton6 singleton6 = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return Singleton7.singleton6;
    }

}
