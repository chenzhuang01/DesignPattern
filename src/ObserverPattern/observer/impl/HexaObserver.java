package ObserverPattern.observer.impl;

import ObserverPattern.subject.Subject;
import ObserverPattern.observer.Observer;

/**
 * @author cz
 * @Date 2024/1/5 15:37
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
