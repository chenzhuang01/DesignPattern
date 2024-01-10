package BuilderPattern.component;

import BuilderPattern.component.pack.Packing;

/**
 * 每个部件的模板
 * @author cz
 * @Date 2024/1/4 10:05
 */
public interface Item {

    //名字
    public String name();

    //打包方式
    public Packing packing();

    //价格
    public float price();
}
