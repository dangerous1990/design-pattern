package org.dangerous.pattern.behavior.chainresponsibility;

/**
 * Created by Administrator on 2016/12/9.
 */
public class WarnLogger extends AbstractLogger {
    public WarnLogger() {
        super.setLevel(super.WARN_LEVEL);
    }

    @Override
    void write(String message) {
        System.out.println("WARN LOG :" + message);
    }
}
