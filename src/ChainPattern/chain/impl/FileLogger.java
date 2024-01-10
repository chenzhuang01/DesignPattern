package ChainPattern.chain.impl;

import ChainPattern.chain.AbstractLogger;

/**
 * @author cz
 * @Date 2024/1/8 14:30
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
