package org.dangerous.pattern.behavior.command;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Invoker {
    public Invoker() {
    }

    public ICommand getiCommand() {
        return iCommand;
    }

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    private ICommand iCommand;


    public void invoke() {
        iCommand.execute();
    }

    ;

}
