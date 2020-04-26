package pattern08_1_ObserverPattern;

public class ConcreteObserver2 implements ObserverO {

	@Override
	public void response() {
		System.out.println("目标变了，2的反应");
	}

}
