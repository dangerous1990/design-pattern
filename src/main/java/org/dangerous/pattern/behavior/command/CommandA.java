package org.dangerous.pattern.behavior.command;

/**
 * Created by Administrator on 2016/12/19.
 */
public class CommandA implements ICommand {

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
