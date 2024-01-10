package StrategyPattern.strategy.impl;

import StrategyPattern.strategy.Strategy;

/**
 * @author cz
 * @Date 2024/1/5 15:20
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
