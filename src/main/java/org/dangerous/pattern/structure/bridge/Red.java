package org.dangerous.pattern.structure.bridge;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Red implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绘制的红色" + name);
    }
}
