package org.dangerous.pattern.behavior.chainresponsibility;

/**
 * Created by Administrator on 2016/12/9.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super.setLevel(super.ERROR_LEVEL);
    }

    @Override
    void write(String message) {
        System.out.println("ERROR LOG :" + message);
    }
}
