package org.dangerous.pattern.behavior.adapter;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        USBPort usbPort = new PS2USB();
        usbPort.workWithUSB();
    }
}
