package org.dangerous.pattern.behavior.chainresponsibility;

/**
 * Created by Administrator on 2016/12/9.
 */
public class InfoLooger extends AbstractLogger {
    public InfoLooger() {
        setLevel(super.INFO_LEVEL);
    }

    @Override
    void write(String message) {
        System.out.println("INFO LOG :" + message);
    }
}
