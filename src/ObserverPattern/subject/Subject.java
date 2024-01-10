package ObserverPattern.subject;

import ObserverPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cz
 * @Date 2024/1/5 15:34
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public abstract void notifyAllObservers();
}
