package BuilderPattern.component.drink.impl;

import BuilderPattern.component.drink.Drink;

/**
 * @author cz
 * @Date 2024/1/4 10:13
 */
public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
