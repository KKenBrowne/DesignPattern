package InterceptingFilter;

//¹ıÂËÆ÷ÊµÌå
public class AuthenticationFilter implements Filter {
	   public void execute(String request){
	      System.out.println("Authenticating request: " + request);
	   }
	}