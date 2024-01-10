package FactoryPattern.factory.impl;

import FactoryPattern.factory.Factory;
import FactoryPattern.product.Shape;
import FactoryPattern.product.impl.Circle;
import FactoryPattern.product.impl.Square;

/**
 * @author cz
 * @Date 2024/1/3 15:53
 */
public class ShapeFactory implements Factory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
