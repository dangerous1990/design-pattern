package org.dangerous.pattern.structure.decorator;

/**
 * Created by Administrator on 2016/12/13.
 */
public class SimplePancake implements Pancake {
    @Override
    public String getName() {
        return "普通大饼";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
