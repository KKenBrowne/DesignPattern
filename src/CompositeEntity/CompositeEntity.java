package CompositeEntity;


//组合实体，也是第二层包装
public class CompositeEntity {
	private FirstPackage firstPackage = new FirstPackage();
	
	public void setData(String data1,String data2){
		firstPackage.setData(data1, data2);
	}
	
	
	public String [] getData(){
		return firstPackage.getData();
	}

}
