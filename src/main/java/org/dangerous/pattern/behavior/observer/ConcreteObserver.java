package org.dangerous.pattern.behavior.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "主题有动静了");
    }
}
