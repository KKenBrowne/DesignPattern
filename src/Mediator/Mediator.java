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
		
		System.out.println("==========ͨ������AӰ��B==========");  
		colleagueA.setNum(1000, mediator);  
        System.out.println("collA��numberֵΪ��"+colleagueA.getNum());  
        System.out.println("collB��numberֵΪA��10����"+colleagueB.getNum());  
  
        System.out.println("==========ͨ������BӰ��A==========");  
        colleagueB.setNum(1000, mediator);  
        System.out.println("collB��numberֵΪ��"+colleagueB.getNum());  
        System.out.println("collA��numberֵΪB��0.1����"+colleagueA.getNum());  
		
	}
	
	

}
