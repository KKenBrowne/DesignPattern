package BusinessDelegate;

// 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。
public class LookUpService {
	
	public BusinessService getBusinessService(String type){
		if(type.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else if(type.equalsIgnoreCase("JMS")){
			return new JMSService();
		}
		return null;
	}

}
