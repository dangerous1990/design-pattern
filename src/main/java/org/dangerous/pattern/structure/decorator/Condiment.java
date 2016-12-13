package org.dangerous.pattern.structure.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public abstract class Condiment implements Pancake {
    protected Pancake pancake;

    public Pancake getPancake() {
        return pancake;
    }

    public Condiment(Pancake pancake) {
        this.pancake = pancake;
    }


    void sold() {
        System.out.println(getName() + ":" + getPrice());
    }

}
