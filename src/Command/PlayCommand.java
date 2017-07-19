package Command;

//具体命令类,播放    每个类一个吗命令，就可以自由扩展，降低耦合
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
