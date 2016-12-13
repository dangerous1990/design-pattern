package org.dangerous.pattern.behavior.template;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        AbstractReport incomeReport = new IncomeReport();
        AbstractReport outcomeReport = new OutcomeReport();
        incomeReport.print();
        outcomeReport.print();
    }
}
