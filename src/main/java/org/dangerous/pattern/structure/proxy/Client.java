package org.dangerous.pattern.structure.proxy;

/**
 * Created by Administrator on 2016/12/15.
 */
public class Client {
    public static void main(String[] args) {
        BookManager bookManager = new BookManagerImpl();
        DyincProxy dyincProxy = new DyincProxy();
        BookManager bookManager1 = (BookManager) dyincProxy.bind(bookManager);

        bookManager1.addBook();
    }
}
