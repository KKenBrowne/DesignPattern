package Proxy;

public class ProxyImage implements Image{
	private String fileName;
	private  RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
		
	}

	//����ģʽ����REALIMAGE���Կ��ƣ�����Ŀ��Ƹ������������Ѿ����ڣ���ֱ���ô���ģ����û�У����ȴ�Դ�ļ���һ������
	@Override
	public void display() {
		if(realImage==null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
		
	}

}
