package ServiceLocator;

//使用Cache里的方法来获取和添加服务
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
		//缓存中没有，就到有这个服务的引用去找
		InitialContext initialContext = new InitialContext();
		Service service1 = (Service) initialContext.lookup(name);
		cache.addService(service1);
		return service1;
		
		
		
	}
	

}
