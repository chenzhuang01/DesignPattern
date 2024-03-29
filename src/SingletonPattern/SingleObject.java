package SingletonPattern;

/**
 * @author cz
 * @Date 2024/1/3 18:33
 */
public class SingleObject {

    //创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private，这样类就不会被实例化
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
