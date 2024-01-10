package DecoratorPattern;

import DecoratorPattern.component.Shape;
import DecoratorPattern.component.impl.Circle;
import DecoratorPattern.component.impl.Rectangle;
import DecoratorPattern.decorator.impl.RedShapeDecorator;
import DecoratorPattern.decorator.ShapeDecorator;

/**
 * @author cz
 * @Date 2024/1/5 10:34
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
