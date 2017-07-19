package Mediator;

public class Mediator extends AbstractMediator{

	public Mediator(AbstractColleague A, AbstractColleague B) {
		super(A, B);
	}

	@Override
	public void AaffectB() {
		int num = A.getNum();
		B.setNum(num*100);
	}

	@Override
	public void BaffectA() {
		int num = B.getNum();
		A.setNum(num/100);
	}
	
	public static void main(String[] args) {
		AbstractColleague colleagueA = new ColleagueA();
		AbstractColleague colleagueB = new ColleagueB();
		
		AbstractMediator mediator = new Mediator(colleagueA, colleagueB);
		
		System.out.println("==========通过设置A影响B==========");  
		colleagueA.setNum(1000, mediator);  
        System.out.println("collA的number值为："+colleagueA.getNum());  
        System.out.println("collB的number值为A的10倍："+colleagueB.getNum());  
  
        System.out.println("==========通过设置B影响A==========");  
        colleagueB.setNum(1000, mediator);  
        System.out.println("collB的number值为："+colleagueB.getNum());  
        System.out.println("collA的number值为B的0.1倍："+colleagueA.getNum());  
		
	}
	
	

}
