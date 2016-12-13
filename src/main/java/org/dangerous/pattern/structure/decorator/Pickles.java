package org.dangerous.pattern.structure.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Pickles extends Condiment {
    public Pickles(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getName() {
        return pancake.getName() + "加咸菜";
    }

    @Override
    public double getPrice() {
        return pancake.getPrice() + 0.5;
    }
}
