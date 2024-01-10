package CommandPattern.command.impl;

import CommandPattern.entity.Stock;
import CommandPattern.command.Order;

/**
 * @author cz
 * @Date 2024/1/8 14:51
 */
public class BuyStock implements Order {
    private Stock absStock;

    public BuyStock(Stock absStock){
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
