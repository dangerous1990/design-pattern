package org.dangerous.pattern.behavior.ChainResponsibility;

/**
 * Created by Administrator on 2016/12/9.
 */
public abstract class AbstractLogger implements Logger {
    protected final int INFO_LEVEL = 1;
    protected final int WARN_LEVEL = 2;
    protected final int ERROR_LEVEL = 3;

    private Logger nextLogger;
    private int level;

    @Override
    public void log(String message, int level) {
        if (this.level >= level) {
            wirte(message);
        } else if (nextLogger != null) {
            nextLogger.log(message, level);
        }
    }

    abstract void wirte(String message);

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
