package org.dangerous.pattern.structure.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreateSubject();
        subject.addListener(new ConcreateObserver("监视1"));
        subject.addListener(new ConcreateObserver("监视2"));
        subject.addListener(new ConcreateObserver("监视3"));
        subject.update();
    }
}
