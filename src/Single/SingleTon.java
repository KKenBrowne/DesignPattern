package Single;
/**
 * ����ʽ���̲߳���ȫ lazying loading    ���Ƽ�ʹ��
 * @author Administrator
 *
 */
public class SingleTon {
	private static SingleTon instance;
	
	private SingleTon(){}
	
	public static SingleTon getInstance(){
		if(instance==null){
			instance = new SingleTon();
		}
		return instance;
		
	}

}
