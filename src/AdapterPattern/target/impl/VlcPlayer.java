package AdapterPattern.target.impl;

import AdapterPattern.target.AdvancedMediaPlayer;

/**
 * @author cz
 * @Date 2024/1/4 15:25
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
