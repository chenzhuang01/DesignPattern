package pattern12_StrategyPattern;

public class MultiBlade implements ICutFruit {

	
	public void CutStrategy(String fruitname) {
		System.out.println(fruitname + "一次被切成八瓣儿");
	}

}
