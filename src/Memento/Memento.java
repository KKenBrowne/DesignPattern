package Memento;

//备忘录角色类，备忘录对象将发起人对象   传入   的状态存储起来。
public class Memento {
	private String state;
	
	
	public Memento(String state)
	{
		this.setState(state);
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	

}
