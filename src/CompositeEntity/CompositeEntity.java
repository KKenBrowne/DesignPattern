package CompositeEntity;


//���ʵ�壬Ҳ�ǵڶ����װ
public class CompositeEntity {
	private FirstPackage firstPackage = new FirstPackage();
	
	public void setData(String data1,String data2){
		firstPackage.setData(data1, data2);
	}
	
	
	public String [] getData(){
		return firstPackage.getData();
	}

}
