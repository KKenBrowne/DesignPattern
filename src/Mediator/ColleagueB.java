package Mediator;

public class ColleagueB extends AbstractColleague {
	
	@Override
	public void setNum(int num, AbstractMediator am) {
		this.num = num;
		am.BaffectA();
	}

}
