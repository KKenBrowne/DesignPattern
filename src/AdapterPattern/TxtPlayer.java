package AdapterPattern;

public class TxtPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playTxt(String fileName) {
		System.out.println("Playing TxT file. Name: "+ fileName);	
		
	}

}
