package ChainPattern;

import ChainPattern.chain.AbstractLogger;
import ChainPattern.chain.impl.ConsoleLogger;
import ChainPattern.chain.impl.ErrorLogger;
import ChainPattern.chain.impl.FileLogger;

/**
 * @author cz
 * @Date 2024/1/8 14:24
 */
public class Demo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
