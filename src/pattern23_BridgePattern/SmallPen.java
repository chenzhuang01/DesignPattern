package pattern23_BridgePattern;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "Ğ¡ºÅÃ«±Ê»æÖÆ";
		this.color.bepaint(penType, name);
	}

}
