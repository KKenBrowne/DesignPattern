package Null;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}
	

}
