package CompositeEntity;


//����ʹ�����ʵ��Ŀͻ����� ,���õڶ����װ�ķ�����Ȼ����������߼��ĵ���
public class Client {
	private CompositeEntity ce = new CompositeEntity();
	
	public void setData(String data1,String data2){
		ce.setData(data1, data2);
	}
	
	public void printData(){
		for(int i=0;i<ce.getData().length;i++){
			System.out.println("Data"+ce.getData()[i] );
		}
	}

}
