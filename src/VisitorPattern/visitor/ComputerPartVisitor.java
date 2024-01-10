package VisitorPattern.visitor;

import VisitorPattern.component.impl.Computer;
import VisitorPattern.component.impl.Keyboard;
import VisitorPattern.component.impl.Monitor;
import VisitorPattern.component.impl.Mouse;

/**
 * @author cz
 * @Date 2024/1/8 16:12
 */
public interface ComputerPartVisitor {
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
