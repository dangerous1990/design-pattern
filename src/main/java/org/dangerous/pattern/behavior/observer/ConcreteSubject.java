package org.dangerous.pattern.behavior.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void update() {
        System.out.println("主题有动静");
        notifyAllListener();
    }
}
