package FacedePattern;

import FacedePattern.component.Shape;
import FacedePattern.component.impl.Circle;
import FacedePattern.component.impl.Rectangle;
import FacedePattern.component.impl.Square;

/**
 * @author cz
 * @Date 2024/1/5 12:31
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
