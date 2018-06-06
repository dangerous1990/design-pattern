package org.dangerous.pattern.structure.adapter;

/**
 * 对象适配器
 * Created by Administrator on 2016/12/13.
 */
public class Client {
    public static void main(String[] args) {
        USBPort usbPort = new PS2USB();
        usbPort.workWithUSB();
    }
}
