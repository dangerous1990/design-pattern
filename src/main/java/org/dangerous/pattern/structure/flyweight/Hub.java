package org.dangerous.pattern.structure.flyweight;

/**
 * Created by Administrator on 2016/12/23.
 */
public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("linked with " + this.type);
    }
}
