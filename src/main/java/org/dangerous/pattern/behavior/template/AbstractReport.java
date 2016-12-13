package org.dangerous.pattern.behavior.template;

/**
 * Created by Administrator on 2016/12/13.
 */
public abstract class AbstractReport {

    public abstract void printHeader();

    public abstract void printBody();

    public abstract void printFooter();

    void print() {
        printHeader();
        printBody();
        printFooter();
    }

}
