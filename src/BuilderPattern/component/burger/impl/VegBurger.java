package BuilderPattern.component.burger.impl;

import BuilderPattern.component.burger.Burger;

/**
 * @author cz
 * @Date 2024/1/4 10:10
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
