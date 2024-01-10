package StrategyPattern;

import StrategyPattern.strategy.Strategy;

/**
 * @author cz
 * @Date 2024/1/5 15:22
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
