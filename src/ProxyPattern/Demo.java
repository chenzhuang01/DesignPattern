package ProxyPattern;

import ProxyPattern.component.Image;
import ProxyPattern.component.impl.ProxyImage;

/**
 * @author cz
 * @Date 2024/1/5 10:53
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println();

        //图像不需要从磁盘加载
        image.display();
    }
}
