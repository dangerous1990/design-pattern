package org.dangerous.pattern.behavior.visitor;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface IVisitor {
    void visit(ElementA element);
    void visit(ElementB element);
}
