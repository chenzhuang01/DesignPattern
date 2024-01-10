package FacedePattern.component.impl;

import FacedePattern.component.Shape;

/**
 * @author cz
 * @Date 2024/1/5 12:29
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
