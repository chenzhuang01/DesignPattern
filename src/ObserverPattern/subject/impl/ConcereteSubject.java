package ObserverPattern.subject.impl;

import ObserverPattern.observer.Observer;
import ObserverPattern.subject.Subject;

/**
 * @author cz
 * @Date 2024/1/5 16:18
 */
public class ConcereteSubject extends Subject {
    @Override
    public void notifyAllObservers() {
        for(Observer observer: observers){
            observer.update();
        }
    }
}
