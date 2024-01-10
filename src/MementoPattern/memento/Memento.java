package MementoPattern.memento;

/**
 * 对象的状态实体
 * @author cz
 * @Date 2024/1/8 15:14
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
