package org.dangerous.pattern.behavior.mediator;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Tenant extends Person {

    protected Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @param message
     * @return void
     * @desc 与中介者联系
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * @param message
     * @return void
     * @desc 获取信息
     */
    public void getMessage(String message) {
        System.out.println("租房者:" + name + ",获得信息：" + message);
    }
}
