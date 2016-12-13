package org.dangerous.pattern.build.builder;

/**
 * Created by Administrator on 2016/12/13.
 */
public interface ReportBuilder {
    void buildHead(String head);

    void buildBody(String body);

    void buildFooter(String footer);

    Report getReport();
}
