package org.dangerous.pattern.build.factory.Abstact;

/**
 * Created by Administrator on 2016/12/9.
 */
public class EmailSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println("邮箱发送："+msg);
    }
}
