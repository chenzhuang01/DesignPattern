package StrategyPattern.strategy.impl;

import StrategyPattern.strategy.Strategy;

/**
 * @author cz
 * @Date 2024/1/5 15:21
 */
public class OperationMul implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
