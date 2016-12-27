package org.dangerous.pattern.behavior.strategy;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Context implements Arithmetic {
    public Arithmetic getArithmetic() {
        return arithmetic;
    }

    public void setArithmetic(Arithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }

    private Arithmetic arithmetic;

    public Context(Arithmetic arithmetic) {
        this.arithmetic = arithmetic;
    }

    @Override
    public int execute(int a, int b) {
        return this.arithmetic.execute(a, b);
    }
}
