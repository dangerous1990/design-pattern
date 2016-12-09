package org.dangerous.pattern.build.factory.Abstact;

/**
 * Created by Administrator on 2016/12/9.
 */
public class WechatSenderFactory implements SenderFactory {
    @Override
    public Sender getSender() {
        return new WechatSender();
    }
}
