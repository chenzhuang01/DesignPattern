package FlyWeightPattern.flyweight;

import FlyWeightPattern.component.Shape;
import FlyWeightPattern.component.impl.Circle;

import java.util.HashMap;

/**
 * @author cz
 * @Date 2024/1/5 14:57
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
