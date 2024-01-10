package AbstractFactoryPattern.product.shape.impl;

import AbstractFactoryPattern.product.shape.Shape;

/**
 * @author cz
 * @Date 2024/1/3 15:52
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
