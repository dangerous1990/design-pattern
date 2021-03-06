package org.dangerous.pattern.behavior.state;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Switch {
    private State state, onState, offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        state = onState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        System.out.print(name);
        state.on(this);
    }

    public void off() {
        System.out.print(name);
        state.off(this);
    }

    public State getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return onState;
        } else {
            return offState;
        }
    }
}
