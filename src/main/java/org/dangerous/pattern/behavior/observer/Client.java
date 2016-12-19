package org.dangerous.pattern.behavior.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addListener(new ConcreteObserver("监视1"));
        subject.addListener(new ConcreteObserver("监视2"));
        subject.addListener(new ConcreteObserver("监视3"));
        subject.update();
    }
}
