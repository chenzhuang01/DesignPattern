package pattern01_CompositePattern;

import java.util.List;

public class Plate extends MyElement {
    private List<MyElement> list;
	
    public void add(MyElement element) {
    	list.add(element);
    }
    
    public void remove(MyElement element) {
    	list.remove(element);
    }
    
	public void eat() {
	   for(MyElement me: list) {
		   me.eat();
	   }
	}

}
