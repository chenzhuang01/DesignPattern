package ChainPattern.chain.impl;

import ChainPattern.chain.AbstractLogger;

/**
 * @author cz
 * @Date 2024/1/8 14:28
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
