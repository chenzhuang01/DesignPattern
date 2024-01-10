package FacedePattern.component.impl;

import FacedePattern.component.Shape;

/**
 * @author cz
 * @Date 2024/1/5 12:28
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
