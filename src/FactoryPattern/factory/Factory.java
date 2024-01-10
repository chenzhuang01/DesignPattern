package FactoryPattern.factory;

import FactoryPattern.product.Shape;

/**
 * @author cz
 * @Date 2024/1/3 16:40
 */
public interface Factory {

    /**
     * 获取形状类型的对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType);
}
