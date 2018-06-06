package org.dangerous.pattern.behavior.state;

/**
 * Created by Administrator on 2016/12/27.
 */
public class OffState implements State {
    @Override
    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(s.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
