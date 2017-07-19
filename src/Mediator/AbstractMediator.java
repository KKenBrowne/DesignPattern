package Mediator;

public abstract class AbstractMediator {
	protected AbstractColleague A;
	protected AbstractColleague B;
	
	
	public AbstractMediator(AbstractColleague A,AbstractColleague B)
	{
		this.A = A;
		this.B = B;
	}
	
	public abstract void AaffectB();  
     
	public abstract void BaffectA();  

}
