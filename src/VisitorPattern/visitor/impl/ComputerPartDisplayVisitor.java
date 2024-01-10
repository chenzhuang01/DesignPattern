package VisitorPattern.visitor.impl;

import VisitorPattern.component.impl.Computer;
import VisitorPattern.component.impl.Keyboard;
import VisitorPattern.component.impl.Monitor;
import VisitorPattern.component.impl.Mouse;
import VisitorPattern.visitor.ComputerPartVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:17
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
