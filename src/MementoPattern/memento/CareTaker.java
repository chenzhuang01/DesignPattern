package MementoPattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录，依次保存各个版本的对象
 * @author cz
 * @Date 2024/1/8 15:18
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
