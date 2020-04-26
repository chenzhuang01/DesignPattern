package pattern05_CommandPattern;

public class Operator {

	public void MarkFruit(Order order) {
		String str = "";
		for(String key:order.getFruitmap().keySet()) {
			str += key + order.getFruitmap().get(key).toString();
		}
		System.out.println("ºÚ°µ»ìºÏÖ­ £º" + str);
	}

}
