package Command;


public class Test {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		PlayCommand playCommand = new PlayCommand(audioPlayer);
		RewindCommand rewindCommand = new RewindCommand(audioPlayer);
		StopCommand stopCommand = new StopCommand(audioPlayer);
		
		
		Keypad keypad = new Keypad();
		keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        
        keypad.play();
        keypad.rewind();
        keypad.stop();


	}

}
