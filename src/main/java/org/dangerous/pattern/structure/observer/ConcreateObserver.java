package org.dangerous.pattern.structure.observer;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ConcreateObserver implements Observer {
    private String name;

    public ConcreateObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "主题有动静了");
    }
}
