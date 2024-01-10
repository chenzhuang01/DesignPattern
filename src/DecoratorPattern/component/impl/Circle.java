package DecoratorPattern.component.impl;

import DecoratorPattern.component.Shape;

/**
 * @author cz
 * @Date 2024/1/5 10:29
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
