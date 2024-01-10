package ChainPattern.chain.impl;

import ChainPattern.chain.AbstractLogger;

/**
 * @author cz
 * @Date 2024/1/8 14:29
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
