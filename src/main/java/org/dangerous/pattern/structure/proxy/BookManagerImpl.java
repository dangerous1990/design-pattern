package org.dangerous.pattern.structure.proxy;

/**
 * Created by Administrator on 2016/12/15.
 */
public class BookManagerImpl implements BookManager {
    @Override
    public void addBook() {
        System.out.println("add book");
    }
}
