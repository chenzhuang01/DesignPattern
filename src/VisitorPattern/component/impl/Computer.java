package VisitorPattern.component.impl;

import VisitorPattern.component.ComputerPart;
import VisitorPattern.visitor.ComputerPartVisitor;

/**
 * @author cz
 * @Date 2024/1/8 16:14
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
    }
}
