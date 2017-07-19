package Observer;

import java.util.ArrayList;
import java.util.List;

//���������ɫ�࣬�����Observer������һ���ۼ�����ArrayList��������ṩadd��delete����
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
	//ÿһ�����۲�Ķ��󣬶���һ��Observer�ļ��ϣ��������仯ʱ���ͻ����������Ͻ���֪ͨ����
	public void notifyObservers(String state){
		for(Observer observer:list){
			observer.update(state);
		}
			
	}
	

}
