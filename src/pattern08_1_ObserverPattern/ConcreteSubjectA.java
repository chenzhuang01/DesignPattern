package pattern08_1_ObserverPattern;

public class ConcreteSubjectA extends SubjectS {
	public ConcreteSubjectA() {
		super();
	}
	
	@Override
	public void notifyObserver() {
		System.out.println("A目标发生改变了");
		for(ObserverO obs:observers) {
			obs.response();
		} 
	}

}
