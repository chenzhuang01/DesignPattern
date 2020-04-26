package pattern04_ProxyPattern;

public class CRemoPic implements IShowPic {

	@Override
	public void ShowPic(String picname) {
		for(int i = 1; i < 4; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
