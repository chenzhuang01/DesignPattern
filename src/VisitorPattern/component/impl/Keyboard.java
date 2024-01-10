package VisitorPattern.component.impl;

import VisitorPattern.component.ComputerPart;
import VisitorPattern.visitor.ComputerPartVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:12
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
