package FrontController;


//调度器，感觉和工厂模式很像
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;
	
	public Dispatcher(){
		studentView = new StudentView();
		homeView = new HomeView();
	}
	
	public void dispatcher(String request){
		if(request.equalsIgnoreCase("Student")){
			studentView.show();
		}
		else{
			homeView.show();
		}
	}

}
