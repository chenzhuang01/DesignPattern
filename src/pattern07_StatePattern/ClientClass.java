package pattern07_StatePattern;

public class ClientClass {
	public static void main(String[] args) {
		ThreadContext tc = new ThreadContext();
		tc.start();
		tc.getCpu();
		tc.suspend();
		//tc.stop();
	}
}
