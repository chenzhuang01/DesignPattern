package BridgePattern.bridge.impl;

import BridgePattern.bridge.DrawAPI;

/**
 * @author cz
 * @Date 2024/1/5 13:09
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
