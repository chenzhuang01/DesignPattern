package BridgePattern;

import BridgePattern.bridge.impl.GreenCircle;
import BridgePattern.bridge.impl.RedCircle;
import BridgePattern.component.Shape;
import BridgePattern.component.impl.Circle;

/**
 * @author cz
 * @Date 2024/1/5 13:53
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
