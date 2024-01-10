package ObserverPattern.observer.impl;

import ObserverPattern.subject.Subject;
import ObserverPattern.observer.Observer;

/**
 * @author cz
 * @Date 2024/1/5 15:37
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
