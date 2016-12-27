package org.dangerous.pattern.behavior.mediator;

/**
 * Created by Administrator on 2016/12/27.
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    protected Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
