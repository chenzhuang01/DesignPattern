package DecoratorPattern.decorator.impl;

import DecoratorPattern.component.Shape;
import DecoratorPattern.decorator.ShapeDecorator;

/**
 * @author cz
 * @Date 2024/1/5 10:32
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
