package pattern08_1_ObserverPattern;

public class ConcreteSubjectB extends SubjectS {
	public ConcreteSubjectB() {
		super();
	}
	
	@Override
	public void notifyObserver() {
		System.out.println("B目标发生改变了");
		for(ObserverO obs:observers) {
			obs.response();
		} 
	}

}
