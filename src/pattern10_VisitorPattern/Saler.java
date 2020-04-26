package pattern10_VisitorPattern;

public class Saler extends AVisitor {

	public void visit(Apple apple) {
		System.out.println("收银员"+ name + "给"+apple+"结账");
	}

	public void visit(Book book) {
		System.out.println("收银员"+ name + "给"+book+"结账");
	}

}
