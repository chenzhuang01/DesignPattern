package AdapterPattern;

import AdapterPattern.source.impl.AudioPlayer;

/**
 * @author cz
 * @Date 2024/1/4 15:35
 */
public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
