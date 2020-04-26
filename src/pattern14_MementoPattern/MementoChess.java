package pattern14_MementoPattern;
/**
 *棋子备忘录，棋子状态 
 *存储原发器的内部状态，根据原发器来决定保存哪些内部状态
 *
 */
public class MementoChess {
	private String label;
	private int x, y;
	
	
	
	public MementoChess(String label, int x, int y) {
		
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
