package pattern17_AdapterPattern;
public class AdapterPatternDemo {
    public static void main(String[] args) {
    	AudioAdapter audioPlayer = new AudioAdapter();
    	
    	audioPlayer.play("mp4", "beyond the horizon.mp4");
    	audioPlayer.play("avi", "alone.avi");
    	audioPlayer.play("vlc", "far far away.vlc");
    }

}
