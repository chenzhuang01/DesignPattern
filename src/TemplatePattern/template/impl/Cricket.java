package TemplatePattern.template.impl;

import TemplatePattern.template.Game;

/**
 * @author cz
 * @Date 2024/1/8 11:06
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
