package org.dangerous.pattern.build.builder;

import java.util.List;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        int  a = 1_2_3;
        IncomeReportBuilder incomeReportBuilder = new IncomeReportBuilder();
        Director director = new Director(incomeReportBuilder);
        director.construct();
        Report report = incomeReportBuilder.getReport();
        System.out.println(report.getHead());
        System.out.println(report.getBody());
        System.out.println(report.getFooter());

    }
}
