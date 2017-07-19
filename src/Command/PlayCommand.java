package Command;

//����������,����    ÿ����һ��������Ϳ���������չ���������
public class PlayCommand implements Command{
	private AudioPlayer audioPlayer;
	
	public PlayCommand(AudioPlayer audioPlayer){
		this.audioPlayer = audioPlayer;
	}

	@Override
	public void execute() {
		audioPlayer.play();
		
	}
	

}
