package org.dangerous.pattern.structure.facade;

/**
 * Created by Administrator on 2016/12/23.
 */
public class SwitchFacade {
    private Light light;
    private AirCondition airCondition;
    private TV tv;

    public SwitchFacade() {
        light = new Light();
        airCondition = new AirCondition();
        tv = new TV();
    }

    public void on() {
        light.on();
        airCondition.on();
        tv.on();
    }

    public void off() {
        light.off();
        airCondition.off();
        tv.off();
    }
}
