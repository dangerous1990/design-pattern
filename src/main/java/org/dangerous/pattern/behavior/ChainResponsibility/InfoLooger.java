package org.dangerous.pattern.behavior.ChainResponsibility;

/**
 * Created by Administrator on 2016/12/9.
 */
public class InfoLooger extends AbstractLogger {
    public InfoLooger() {
        setLevel(super.INFO_LEVEL);
    }

    @Override
    void wirte(String message) {
        System.out.println("INFO LOG :" + message);
    }
}
