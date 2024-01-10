package PrototypePattern.prototype.impl;

import PrototypePattern.prototype.Shape;

/**
 * @author cz
 * @Date 2024/1/4 14:56
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
