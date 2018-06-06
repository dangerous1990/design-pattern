package org.dangerous.pattern.behavior.command;

/**
 * 命令模式
 * Created by Administrator on 2016/12/19.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver reciver = new Receiver();
        CommandA commandA = new CommandA();
        commandA.setReceiver(reciver);
        invoker.setiCommand(commandA);
        invoker.invoke();
    }
}
