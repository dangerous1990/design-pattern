package org.dangerous.pattern.behavior.strategy;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Subtract implements Arithmetic {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
