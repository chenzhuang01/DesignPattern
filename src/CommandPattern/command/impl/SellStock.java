package CommandPattern.command.impl;

import CommandPattern.entity.Stock;
import CommandPattern.command.Order;

/**
 * @author cz
 * @Date 2024/1/8 14:54
 */
public class SellStock implements Order {
    private Stock absStock;

    public SellStock(Stock absStock){
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.sell();
    }
}
