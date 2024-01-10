package AdapterPattern.source.impl;

import AdapterPattern.target.AdvancedMediaPlayer;
import AdapterPattern.source.MediaPlayer;
import AdapterPattern.target.impl.Mp4Player;
import AdapterPattern.target.impl.VlcPlayer;

/**
 * @author cz
 * @Date 2024/1/4 15:31
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
