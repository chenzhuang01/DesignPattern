package BridgePattern.component.impl;

import BridgePattern.bridge.DrawAPI;
import BridgePattern.component.Shape;

/**
 * @author cz
 * @Date 2024/1/5 13:51
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
