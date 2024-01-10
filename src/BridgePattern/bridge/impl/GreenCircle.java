package BridgePattern.bridge.impl;

import BridgePattern.bridge.DrawAPI;

/**
 * @author cz
 * @Date 2024/1/5 13:11
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
