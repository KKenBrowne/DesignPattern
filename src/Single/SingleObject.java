package Single;


/**
 * 饿汉式，类加载就初始化，线程安全效率高，但是容易产生垃圾对象，比较常用
 * @author Administrator
 *
 */
public class SingleObject {
	//创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();
	 //让构造函数为 private，这样该类就不会被实例化
	private SingleObject(){};
	
	//获取唯一可用的对象
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage()
	{
	  System.out.println("Hello World!");
	}

}
