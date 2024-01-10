package StatePattern;

import StatePattern.state.State;

/**
 * @author cz
 * @Date 2024/1/8 15:44
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
