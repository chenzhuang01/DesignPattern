package BuilderPattern.component.burger;

import BuilderPattern.component.pack.Packing;
import BuilderPattern.component.pack.impl.Wrapper;
import BuilderPattern.component.Item;

/**
 * 汉堡的抽象类
 * @author cz
 * @Date 2024/1/4 10:04
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
