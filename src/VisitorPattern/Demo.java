package VisitorPattern;

import VisitorPattern.component.ComputerPart;
import VisitorPattern.component.impl.Computer;
import VisitorPattern.visitor.impl.ComputerPartDisplayVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:09
 */
public class Demo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
