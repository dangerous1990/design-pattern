package org.dangerous.pattern.behavior.state;

/**
 * Created by Administrator on 2016/12/27.
 */
public class OnState implements State {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(s.getState("off"));

    }
}
