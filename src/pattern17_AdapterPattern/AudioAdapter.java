package pattern17_AdapterPattern;
public class AudioAdapter implements MediaPlayer {
     MediaAdapter mediaAdapter;
    public void play(String audioType, String fileName) {
    	
    	//播放mp4文件的内置支持
    	if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
    		mediaAdapter = new MediaAdapter(audioType);
    		mediaAdapter.play(audioType, fileName);
    	}else {
    		System.out.println("Invalid media. "+ audioType + "format not supported");
    	}
    }

}
