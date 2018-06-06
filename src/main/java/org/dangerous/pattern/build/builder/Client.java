package org.dangerous.pattern.build.builder;

/**
 * 建造者模式
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        IncomeReportBuilder incomeReportBuilder = new IncomeReportBuilder();
        Director director = new Director(incomeReportBuilder);
        director.construct();
        Report report = incomeReportBuilder.getReport();
        System.out.println(report.getHead());
        System.out.println(report.getBody());
        System.out.println(report.getFooter());

    }
}
