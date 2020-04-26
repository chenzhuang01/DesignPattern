package pattern22_FactoryPattern;

public class ClientClass {
	public static void main(String[] args) {
		Factory factor = new AFactory();
		Fruit fruit = factor.CreateFruit("A");
		fruit.eat();
	}
}
