package PrototypePattern;

import PrototypePattern.cache.ShapeCache;
import PrototypePattern.prototype.Shape;

/**
 * @author cz
 * @Date 2024/1/4 15:03
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedCircle.getType());

        Shape clonedSquare = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedSquare.getType());

        Shape clonedRectangle = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedRectangle.getType());
    }
}
