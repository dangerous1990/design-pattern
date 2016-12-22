package org.dangerous.pattern.structure.bridge;

/**
 * Created by Administrator on 2016/12/22.
 */
public abstract class Pen {
    public void setColor(Color color) {
        this.color = color;
    }

    protected Color color;


    abstract void draw();
}
