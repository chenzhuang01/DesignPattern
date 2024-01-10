package BuilderPattern.object;

import BuilderPattern.component.burger.impl.ChickenBurger;
import BuilderPattern.component.burger.impl.VegBurger;
import BuilderPattern.component.drink.impl.Coke;
import BuilderPattern.component.drink.impl.Pepsi;

/**
 * 构建复杂对象
 * @author cz
 * @Date 2024/1/4 10:23
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
