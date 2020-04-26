package pattern08_2_ObserverPattern;

public interface IStockHolder {
	public void update(AStockPrice asp);
	public void AddHolder(AStockPrice asp);
}
