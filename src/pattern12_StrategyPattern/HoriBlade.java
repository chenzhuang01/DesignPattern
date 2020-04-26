package pattern12_StrategyPattern;

public class HoriBlade implements ICutFruit {

	
	public void CutStrategy(String fruitname) {
		System.out.println(fruitname + "一次被切成几片");
	}

}
