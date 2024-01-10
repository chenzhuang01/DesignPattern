package MediatorPattern;

/**
 * @author cz
 * @Date 2024/1/8 16:34
 */
public class Demo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
