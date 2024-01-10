package VisitorPattern.component.impl;

import VisitorPattern.component.ComputerPart;
import VisitorPattern.visitor.ComputerPartVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:14
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
