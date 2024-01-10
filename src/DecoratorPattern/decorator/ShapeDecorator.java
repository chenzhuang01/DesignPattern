package DecoratorPattern.decorator;

import DecoratorPattern.component.Shape;

/**
 * @author cz
 * @Date 2024/1/5 10:31
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
