package org.dangerous.pattern.build.builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class IncomeReportBuilder implements ReportBuilder {
    Report report = new Report();

    @Override
    public void buildHead(String head) {
        report.setHead(head);

    }

    @Override
    public void buildBody(String body) {
        report.setBody(body);
    }

    @Override
    public void buildFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public Report getReport() {
        return report;
    }
}
