package BuilderPattern.object;

import BuilderPattern.component.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂对象要实现的方法
 * @author cz
 * @Date 2024/1/4 10:15
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : items){
            System.out.print("Item : " + item.name() + ", Packing : " + item.packing().pack() + ", Price : " + item.price());
            System.out.println();
        }
    }
}
