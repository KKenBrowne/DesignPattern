package AdapterPattern;


/**
 * ��һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�������ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������
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
