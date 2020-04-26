package pattern04_ProxyPattern;

public class CLocalPicShow implements IShowPic, Runnable {
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		pic = new CRemoPic();
		this.picname = picname;
		System.out.println("准备载入图片" + picname);
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		pic.ShowPic(picname);
		System.out.println(picname + "图片加载完成");
	}

}
