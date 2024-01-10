package BuilderPattern.component.pack.impl;

import BuilderPattern.component.pack.Packing;

/**
 * @author cz
 * @Date 2024/1/4 10:08
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
