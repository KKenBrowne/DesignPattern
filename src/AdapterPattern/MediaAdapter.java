package AdapterPattern;


/**
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @author Administrator
 *
 */
public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String type) {
		if(type.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}
		else if(type.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
		else if(type.equalsIgnoreCase("txt")){
			advancedMediaPlayer = new TxtPlayer();
		}
		
	}
	
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
		else if(audioType.equalsIgnoreCase("txt")){
			advancedMediaPlayer.playTxt(fileName);
		}
	}
	

}
