package org.dangerous.pattern.behavior.template;

/**
 * Created by Administrator on 2016/12/13.
 */
public class OutcomeReport extends AbstractReport {
    @Override
    public void printHeader() {
        System.out.println("打印支出报表头");
    }

    @Override
    public void printBody() {
        System.out.println("打印支出报表明细");
    }

    @Override
    public void printFooter() {
        System.out.println("打印支出报表尾统计信息");
    }
}
