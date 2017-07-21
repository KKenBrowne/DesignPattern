package ServiceLocator;

//ʹ��Cache��ķ�������ȡ����ӷ���
public class ServiceLocator {
	private static Cache cache;
	
	
	static{
		cache = new Cache();
	}
	
	public static Service getService(String name){
		Service service = cache.getService(name);
		
		if(service!=null){
			return service;
		}
		//������û�У��͵���������������ȥ��
		InitialContext initialContext = new InitialContext();
		Service service1 = (Service) initialContext.lookup(name);
		cache.addService(service1);
		return service1;
		
		
		
	}
	

}
