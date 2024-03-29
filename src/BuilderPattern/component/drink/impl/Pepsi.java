package BuilderPattern.component.drink.impl;

import BuilderPattern.component.drink.Drink;

/**
 * @author cz
 * @Date 2024/1/4 10:13
 */
public class Pepsi extends Drink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
