package BuilderPattern.component.drink;

import BuilderPattern.component.pack.Packing;
import BuilderPattern.component.pack.impl.Bottle;
import BuilderPattern.component.Item;

/**
 * 饮料的抽象类
 * @author cz
 * @Date 2024/1/4 10:12
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
