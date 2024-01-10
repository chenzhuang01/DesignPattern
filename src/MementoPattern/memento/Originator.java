package MementoPattern.memento;

/**
 * 当前对象的状态，包括回滚操作和保存操作
 * @author cz
 * @Date 2024/1/8 15:15
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
