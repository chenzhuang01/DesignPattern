package pattern10_VisitorPattern;



public class ClientClass {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		IProduct b1 = new Book();
		IProduct b2 = new Book();
		IProduct a1 = new Apple();
		AVisitor visitor = new Customer();
		
		BuyBasket basket = new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor.setName("уехЩ");
		basket.accept(visitor);
	}
}
