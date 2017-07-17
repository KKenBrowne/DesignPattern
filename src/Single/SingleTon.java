package Single;
/**
 * 懒汉式，线程不安全 lazying loading    不推荐使用
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
