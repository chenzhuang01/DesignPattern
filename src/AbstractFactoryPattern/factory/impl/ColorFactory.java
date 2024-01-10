package AbstractFactoryPattern.factory.impl;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.product.color.Color;
import AbstractFactoryPattern.product.color.impl.Green;
import AbstractFactoryPattern.product.color.impl.Red;
import AbstractFactoryPattern.product.shape.Shape;

/**
 * @author cz
 * @Date 2024/1/3 17:14
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }else if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
