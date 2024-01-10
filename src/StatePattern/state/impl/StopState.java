package StatePattern.state.impl;

import StatePattern.Context;
import StatePattern.state.State;

/**
 * @author cz
 * @Date 2024/1/8 15:46
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
