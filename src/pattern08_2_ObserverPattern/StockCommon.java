package pattern08_2_ObserverPattern;

public class StockCommon extends AStockPrice {
	
	public StockCommon(String code) {
		super(code);
	}
	
	@Override
	protected void notifyHolder() {
		System.out.println("普通股票期货更新了-" + code + ":" + price);
		for(IStockHolder ish:stockHolderlist) {
			ish.update(this);
		}
		price2 = price;
	}

}
