package BusinessDelegate;


//һ��Ϊ�ͻ���ʵ���ṩ������࣬���ṩ�˶�ҵ����񷽷��ķ��ʡ�
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
