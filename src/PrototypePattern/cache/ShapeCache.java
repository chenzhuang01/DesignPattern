package PrototypePattern.cache;

import PrototypePattern.prototype.Shape;
import PrototypePattern.prototype.impl.Circle;
import PrototypePattern.prototype.impl.Rectangle;
import PrototypePattern.prototype.impl.Square;

import java.util.Hashtable;

/**
 * @author cz
 * @Date 2024/1/4 14:59
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
