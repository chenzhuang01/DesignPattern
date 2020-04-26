package pattern22_FactoryPattern;

public class AFactory extends Factory {
	public Fruit CreateFruit() {
		return new Apple();
	}
}
