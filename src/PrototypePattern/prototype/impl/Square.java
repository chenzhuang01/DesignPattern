package PrototypePattern.prototype.impl;

import PrototypePattern.prototype.Shape;

/**
 * @author cz
 * @Date 2024/1/4 14:57
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
