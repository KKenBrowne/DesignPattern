package Chain;

public abstract class Handler {
	
	protected Handler successor;
	
	//��ʹ�õ�ʱ����Ҫ��װ��������
	public Handler getSuccessor(){
		return successor;
	}
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public abstract String handleFeeRequest(String user , double fee); 
	
	
	

}
