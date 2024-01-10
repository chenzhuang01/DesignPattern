package BuilderPattern.component.burger.impl;

import BuilderPattern.component.burger.Burger;

/**
 * @author cz
 * @Date 2024/1/4 10:11
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
