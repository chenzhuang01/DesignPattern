package AbstractFactoryPattern.factory.impl;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.product.color.Color;
import AbstractFactoryPattern.product.shape.Shape;
import AbstractFactoryPattern.product.shape.impl.Square;
import AbstractFactoryPattern.product.shape.impl.Circle;

/**
 * @author cz
 * @Date 2024/1/3 15:53
 */
public class ShapeFactory extends AbstractFactory {

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

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
