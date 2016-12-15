package org.dangerous.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/12/15.
 */
public class DyincProxy implements InvocationHandler {

    private Object o;

    public Object bind(Object target) {
        this.o = target;
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("begin add book");
        // 执行方法
        result = method.invoke(o, args);
        System.out.println("end add book");
        return result;
    }
}
