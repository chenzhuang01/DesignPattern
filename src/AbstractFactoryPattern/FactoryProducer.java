package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factory.impl.ColorFactory;
import AbstractFactoryPattern.factory.impl.ShapeFactory;

/**
 * @author cz
 * @Date 2024/1/3 17:16
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
