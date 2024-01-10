package BridgePattern.component;

import BridgePattern.bridge.DrawAPI;

/**
 * @author cz
 * @Date 2024/1/5 13:12
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
