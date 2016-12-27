package org.dangerous.pattern.behavior.state;

/**
 * Created by Administrator on 2016/12/27.
 */
public abstract class State {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}
