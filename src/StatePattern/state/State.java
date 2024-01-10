package StatePattern.state;

import StatePattern.Context;

/**
 * @author cz
 * @Date 2024/1/8 15:44
 */
public interface State {
    public void doAction(Context context);
}
