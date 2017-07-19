package Chain;

public abstract class Handler {
	
	protected Handler successor;
	
	//在使用的时候需要组装责任链。
	public Handler getSuccessor(){
		return successor;
	}
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public abstract String handleFeeRequest(String user , double fee); 
	
	
	

}
