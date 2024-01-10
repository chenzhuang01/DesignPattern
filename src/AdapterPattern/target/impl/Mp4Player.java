package AdapterPattern.target.impl;

import AdapterPattern.target.AdvancedMediaPlayer;

/**
 * @author cz
 * @Date 2024/1/4 15:26
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
