package org.dangerous.pattern.build.factory.Abstact;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Client {
    public static void main(String[] args) {
        SenderFactory smsFactory = new SMSSenderFactory();
        SenderFactory mailFactory = new EmailSenderFactory();
        SenderFactory wechatFactory = new WechatSenderFactory();
        smsFactory.getSender().send("hello world");
        mailFactory.getSender().send("hello world");
        wechatFactory.getSender().send("hello world");
    }
}
