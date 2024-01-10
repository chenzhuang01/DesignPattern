package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.product.color.Color;
import AbstractFactoryPattern.product.shape.Shape;

/**
 * @author cz
 * @Date 2024/1/3 16:40
 */
public abstract class AbstractFactory {

    /**
     * 获取形状类型的对象
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);

    /**
     * 获取颜色类型的对象
     * @param colorType
     * @return
     */
    public abstract Color getColor(String colorType);
}
