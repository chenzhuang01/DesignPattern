package CommandPattern.broker;

import CommandPattern.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * @author cz
 * @Date 2024/1/8 14:55
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(Order order){
        order.execute();
    }
}
