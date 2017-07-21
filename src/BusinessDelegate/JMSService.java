package BusinessDelegate;

public class JMSService implements BusinessService{

	@Override
	public void doService() {
		System.out.println("Do JMS Service");
	}

}
