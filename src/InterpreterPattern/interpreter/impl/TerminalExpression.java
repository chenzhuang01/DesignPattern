package InterpreterPattern.interpreter.impl;

import InterpreterPattern.interpreter.Expression;

/**
 * @author cz
 * @Date 2024/1/8 16:45
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
