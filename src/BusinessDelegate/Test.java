package BusinessDelegate;


public class Test {
	public static void main(String[] args) {
		
		BusinessDelegate bDelegate = new BusinessDelegate();
		bDelegate.setType("JMS");
		
		bDelegate.doTask();
		
		bDelegate.setType("EJB");
		bDelegate.doTask();
		
		
	}
	

}
