package StrategyPattern;

import StrategyPattern.strategy.impl.OperationAdd;
import StrategyPattern.strategy.impl.OperationMul;
import StrategyPattern.strategy.impl.OperationSub;

/**
 * @author cz
 * @Date 2024/1/5 15:23
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
