package org.dangerous.pattern.behavior.strategy;

/**
 * 策略模式，实现计算器
 * Created by Administrator on 2016/12/27.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        int addResult = context.execute(1, 2);
        context.setArithmetic(new Subtract());
        int subResult = context.execute(3, 1);
        System.out.println(addResult);
        System.out.println(subResult);
    }
}
