package TemplatePattern;

import TemplatePattern.template.Game;
import TemplatePattern.template.impl.Cricket;
import TemplatePattern.template.impl.Football;

/**
 * @author cz
 * @Date 2024/1/8 11:04
 */
public class Demo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("---------------------");
        game = new Football();
        game.play();
    }
}
