package CommandPattern;

import CommandPattern.broker.Broker;
import CommandPattern.command.impl.BuyStock;
import CommandPattern.command.impl.SellStock;
import CommandPattern.entity.Stock;

/**
 * @author cz
 * @Date 2024/1/8 14:50
 */
public class Demo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders(buyStockOrder);
        broker.placeOrders(sellStockOrder);
    }
}
