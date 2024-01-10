package MediatorPattern.mediator;

import MediatorPattern.User;

import java.util.Date;

/**
 * @author cz
 * @Date 2024/1/8 16:35
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
