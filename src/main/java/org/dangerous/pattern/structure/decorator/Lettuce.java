package org.dangerous.pattern.structure.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Lettuce extends Condiment {
    public Lettuce(Pancake pancake) {
        super(pancake);
    }

    @Override
    public String getName() {
        return pancake.getName() + "加生菜";
    }

    @Override
    public double getPrice() {
        return pancake.getPrice() + 1.0;
    }
}
