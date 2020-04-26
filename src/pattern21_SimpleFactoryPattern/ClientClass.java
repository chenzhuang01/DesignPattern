package pattern21_SimpleFactoryPattern;

public class ClientClass {
	public static void main(String[] args) {
		Factory factor = new Factory();
		Fruit fruit = factor.CreateFruit("A");
		fruit.eat();
	}
	

}
