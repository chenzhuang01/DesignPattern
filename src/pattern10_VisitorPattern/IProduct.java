package pattern10_VisitorPattern;

public interface IProduct {
	void accept(AVisitor visitor);
}
