package org.dangerous.pattern.behavior.iterator;

/**
 * Created by Administrator on 2016/12/20.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
