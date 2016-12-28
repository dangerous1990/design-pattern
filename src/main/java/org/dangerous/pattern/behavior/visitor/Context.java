package org.dangerous.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
public class Context {
        List<Element> list = new ArrayList();
        public void add(Element node) {
            boolean add = list.add(node);
        }
        public void visit(IVisitor visitor) {
            for(Element node : list){
                node.accept(visitor);
            }
        }
    }
