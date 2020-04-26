package pattern03_FlyweightPattern;

public class OnePiece extends APiece {

	public OnePiece(String inKind) {
		super(inKind);
	}

	
	public void Play(int x, int y) {
		System.out.println(inKind + ": (" + x + ", " + y + ")");
	}

}
