package PrototypePattern.prototype.impl;

import PrototypePattern.prototype.Shape;

/**
 * @author cz
 * @Date 2024/1/4 14:58
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
