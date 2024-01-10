package VisitorPattern.component;

import VisitorPattern.visitor.ComputerPartVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:10
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
