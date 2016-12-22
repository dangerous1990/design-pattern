package org.dangerous.pattern.structure.bridge;

/**
 * Created by Administrator on 2016/12/22.
 */
public class Client {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();
        Pen bigPen = new BigPen();
        bigPen.setColor(red);
        bigPen.draw();
        Pen smallPen = new SmallPen();
        smallPen.setColor(green);
        smallPen.draw();
    }
}
