package FrontController;


//���������о��͹���ģʽ����
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
