package org.dangerous.pattern.behavior.chainresponsibility;

/**
 * 每个记录器消息的级别是否属于自己的级别，如果是则相应地打印出来，否则将不打印并把消息传给下一个记录器。
 * 责任链模式
 * Created by Administrator on 2016/12/9.
 */
public class Client {
    public static void main(String[] args) {
        Logger logger = getLoggerChain();
        logger.log("info ", 1);
        logger.log("warn", 2);
        logger.log("error", 3);

    }

    private static Logger getLoggerChain() {
        InfoLooger infoLooger = new InfoLooger();
        WarnLogger warnLogger = new WarnLogger();
        ErrorLogger errorLogger = new ErrorLogger();
        infoLooger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(errorLogger);
        return infoLooger;
    }

}
