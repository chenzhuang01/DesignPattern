package pattern23_BridgePattern;

public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		String penType = "С��ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
