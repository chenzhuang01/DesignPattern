package BuilderPattern.component.pack.impl;

import BuilderPattern.component.pack.Packing;

/**
 * @author cz
 * @Date 2024/1/4 10:07
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
