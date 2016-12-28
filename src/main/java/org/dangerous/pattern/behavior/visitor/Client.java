package org.dangerous.pattern.behavior.visitor;

/**
 * Created by Administrator on 2016/12/28.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.add(new ElementA());
        context.add(new ElementB());

        context.visit(new VisitorA());
        context.visit(new VisitorB());
    }
}
