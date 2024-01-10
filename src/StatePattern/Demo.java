package StatePattern;

import StatePattern.state.impl.StartState;
import StatePattern.state.impl.StopState;

/**
 * @author cz
 * @Date 2024/1/8 15:43
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
