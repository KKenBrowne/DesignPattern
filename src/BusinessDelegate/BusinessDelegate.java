package BusinessDelegate;


//一个为客户端实体提供的入口类，它提供了对业务服务方法的访问。
public class BusinessDelegate {
	private BusinessService businessService;
	private String type;
	private LookUpService lookUpService = new LookUpService();
	
	public void setType(String type){
		this.type = type;
	}
	
		
	public void doTask(){
		businessService = lookUpService.getBusinessService(type);
		businessService.doService();
	}
	
	

}
