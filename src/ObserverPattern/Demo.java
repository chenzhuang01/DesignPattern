package ObserverPattern;

import ObserverPattern.observer.impl.BinaryObserver;
import ObserverPattern.observer.impl.HexaObserver;
import ObserverPattern.observer.impl.OctalObserver;
import ObserverPattern.subject.Subject;
import ObserverPattern.subject.impl.ConcereteSubject;

/**
 * @author cz
 * @Date 2024/1/5 15:40
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new ConcereteSubject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
