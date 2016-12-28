package org.dangerous.pattern.behavior.visitor;

/**
 * Created by Administrator on 2016/12/28.
 */
public interface Element {
    void accept(IVisitor visitor);
    void visit();
}
