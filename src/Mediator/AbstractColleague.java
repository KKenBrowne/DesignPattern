package Mediator;

public abstract class AbstractColleague {
	protected int num;
	
	public void setNum(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
	
	public abstract void setNum(int num,AbstractMediator am);

}
