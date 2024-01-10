package AbstractFactoryPattern.product.color.impl;

import AbstractFactoryPattern.product.color.Color;

/**
 * @author cz
 * @Date 2024/1/3 17:11
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
