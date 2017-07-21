package CompositeEntity;


//创建使用组合实体的客户端类 ,调用第二层包装的方法，然后加以其他逻辑的调用
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
