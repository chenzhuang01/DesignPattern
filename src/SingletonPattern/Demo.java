package SingletonPattern;

/**
 * @author cz
 * @Date 2024/1/3 18:35
 */
public class Demo {

    public static void main(String[] args) {
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
