package org.dangerous.pattern.behavior.state;

/**
 * Created by Administrator on 2016/12/27.
 */
public interface State {
    void on(Switch s);

    void off(Switch s);
}
