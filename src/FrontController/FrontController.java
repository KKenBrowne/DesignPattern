package FrontController;


//负责接收请求request，然后把请求传给dispatcher ，dispatcher根据请求执行不同视图（操作）
public class FrontController {
	
	private Dispatcher dispatcher;

	   public FrontController(){
		   dispatcher = new Dispatcher();
	   }
	   
	   //是有效的用户
	   private boolean isAuthenticUser()
	   {
	      System.out.println("User is authenticated successfully.");
	      return true;
	   }
	   
	   private void trackRequest(String request)
	   {
	      System.out.println("Page requested: " + request);
	   }
	   
	   public void dispatchRequest(String request){
		   trackRequest(request);
		   if(isAuthenticUser()){
			   dispatcher.dispatcher(request);
		   }
	   }
	   
	   
	   
	   

}
