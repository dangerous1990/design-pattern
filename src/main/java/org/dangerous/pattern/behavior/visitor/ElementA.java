package org.dangerous.pattern.behavior.visitor;

/**
 * Created by Administrator on 2016/12/28.
 */
public class ElementA implements Element{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void visit() {
        System.out.println("visit element A ");
    }
}
