package org.dangerous.pattern.structure.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ConcreateSubject extends Subject {
    @Override
    public void update() {
        System.out.println("主题有动静");
        notifyAllListener();
    }
}
