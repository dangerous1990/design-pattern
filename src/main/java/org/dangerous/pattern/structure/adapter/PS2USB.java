package org.dangerous.pattern.structure.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class PS2USB implements USBPort {
    private PS2Port ps2Port;

    public PS2USB() {
        this.ps2Port = new PS2PortImpl();
    }

    @Override
    public void workWithUSB() {
        System.out.println("ps2转USB");
        ps2Port.workWithPS2();
    }
}
