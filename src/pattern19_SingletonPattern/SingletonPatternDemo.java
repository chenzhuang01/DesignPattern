package pattern19_SingletonPattern;

public class SingletonPatternDemo {
public static void main(String[] args) {
	//不合法的构造函数
	//编译时错误，构造函数SingleObject()时不可见的
	//SingleObject object = new SingleObject();
	
	//获取唯一可用对象
	SingleObject object  = SingleObject.getInstance();
	
	//显示消息
	object.showMessage();
	
}
}
