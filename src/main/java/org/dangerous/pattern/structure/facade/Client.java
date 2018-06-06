package org.dangerous.pattern.structure.facade;

/**
 * facade模式
 * Created by Administrator on 2016/12/23.
 */
public class Client {
    public static void main(String[] args) {
        SwitchFacade switchFacade = new SwitchFacade();
        switchFacade.on();
        System.out.println();
        switchFacade.off();
    }
}
