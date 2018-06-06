package org.dangerous.pattern.structure.flyweight;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/23.
 */
public class DeviceFactory {
    private ArrayList devices = new ArrayList();
    private int totalTerminal = 0;

    public DeviceFactory() {
        NetworkDevice cisco = new Switch("Cisco-WS-C2950-24");
        devices.add(cisco);
        NetworkDevice tp = new Hub("TP-LINK-HF8M");
        devices.add(tp);
    }

    public NetworkDevice getNetworkDevice(String type) {
        if (type.equalsIgnoreCase("cisco")) {
            totalTerminal++;
            return (NetworkDevice) devices.get(0);
        } else if (type.equalsIgnoreCase("tp")) {
            totalTerminal++;
            return (NetworkDevice) devices.get(1);
        } else {
            return null;
        }
    }

    public int getTotalDevice() {
        return devices.size();
    }

    public int getTotalTerminal() {
        return totalTerminal;
    }


}
