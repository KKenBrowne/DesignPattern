package Mediator;

public class ColleagueA extends AbstractColleague{

	@Override
	public void setNum(int num, AbstractMediator am) {
		this.num = num;
		am.AaffectB();
	}

}
