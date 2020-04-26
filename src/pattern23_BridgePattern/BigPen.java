package pattern23_BridgePattern;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "´óºÅÃ«±Ê»æÖÆ";
		this.color.bepaint(penType, name);
	}

}
