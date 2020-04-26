package pattern08_1_ObserverPattern;

public class ConcreteObserver1 implements ObserverO {

	@Override
	public void response() {
		System.out.println("目标变了，1的反应");
	}

}
