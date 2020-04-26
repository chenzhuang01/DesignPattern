package pattern10_VisitorPattern;

public class Customer extends AVisitor {

	public void visit(Apple apple) {
		System.out.println("顾客"+ name + "选苹果");
	}

	public void visit(Book book) {
		System.out.println("顾客"+ name + "买书");
	}

}
