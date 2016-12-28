package org.dangerous.pattern.behavior.visitor;

/**
 * Created by Administrator on 2016/12/28.
 */
public class VisitorA implements IVisitor {

    @Override
    public void visit(ElementA element) {
        System.out.println("visitor A" );
        element.visit();
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("visitor A " );
        element.visit();
    }
}
