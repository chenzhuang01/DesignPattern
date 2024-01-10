package ObserverPattern.observer;

import ObserverPattern.subject.Subject;

/**
 * @author cz
 * @Date 2024/1/5 15:33
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
