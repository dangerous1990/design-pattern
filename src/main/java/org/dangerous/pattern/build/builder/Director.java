package org.dangerous.pattern.build.builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Director {
    private ReportBuilder reportBuilder;

    public Director(ReportBuilder reportBuilder) {
        this.reportBuilder = reportBuilder;
    }

    public void construct() {
        reportBuilder.buildBody("body");
        reportBuilder.buildHead("head");
        reportBuilder.buildFooter("footer");
    }
}
