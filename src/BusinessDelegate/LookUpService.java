package BusinessDelegate;

// ���ҷ���������ȡ��ص�ҵ��ʵ�֣����ṩҵ������ҵ��������ķ��ʡ�
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
