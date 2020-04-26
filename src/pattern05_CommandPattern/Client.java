package pattern05_CommandPattern;

public class Client {
	public static void main(String[] args) {
		//创建多个订单
		Order order1 = new Order();
		order1.setId(1);
		order1.setFruitmap("橙子", 1);
		order1.setFruitmap("梨子", 2);
		order1.setFruitmap("苹果", 3);
		
		Order order2 = new Order();
		order2.setId(1);
		order2.setFruitmap("香蕉", 4);
		order2.setFruitmap("葡萄", 2);
		order2.setFruitmap("苹果", 3);
		//创建操作者
		Operator operator1 = new Operator();
		//将多个订单封装成命令对象
		OrderCommand oc1 = new OrderCommand(operator1, order1);
		OrderCommand oc2 = new OrderCommand(operator1, order2);
		//创建调用者并加命令
		WaitorInvoker waitor = new WaitorInvoker();
		waitor.SetCommand(oc1);
		waitor.SetCommand(oc2);
		//执行命令
		waitor.OrderUp();
	}
}
