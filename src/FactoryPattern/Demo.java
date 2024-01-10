package FactoryPattern;

import FactoryPattern.factory.Factory;
import FactoryPattern.factory.impl.ShapeFactory;
import FactoryPattern.product.Shape;

/**
 * @author cz
 * @Date 2024/1/3 15:59
 */
public class Demo {

    public static void main(String[] args) {
        Factory shapeFactory = new ShapeFactory();

        //获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取Square的对象，并调用它的draw方法
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
