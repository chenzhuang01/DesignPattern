package TemplatePattern.template.impl;

import TemplatePattern.template.Game;

/**
 * @author cz
 * @Date 2024/1/8 11:09
 */
public class Football extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
