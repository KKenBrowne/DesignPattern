package Observer;

import java.util.ArrayList;
import java.util.List;

//抽象主题角色类，负责把Observer保存在一个聚集（如ArrayList）里，并且提供add和delete方法
public abstract class Subject {
	
	private List<Observer> list = new ArrayList<Observer>();
	
	public void add(Observer observer){
		list.add(observer);
		System.out.println("add an observer");
	}
	
	public void delete(Observer observer){
		list.remove(observer);
		System.out.println("remove an observer");
	}
	//每一个被观察的对象，都有一个Observer的集合，当发生变化时，就会遍历这个集合进行通知更新
	public void notifyObservers(String state){
		for(Observer observer:list){
			observer.update(state);
		}
			
	}
	

}
