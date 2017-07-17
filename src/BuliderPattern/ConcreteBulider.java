package BuliderPattern;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ConcreteBulider implements Builder{
	private Computer computer =  new Computer();

	@Override
	public void buildName() {
		// TODO Auto-generated method stub
		computer.setName("»úĞµ¸ïÃü");
	}

	@Override
	public void buildPrice() {
		// TODO Auto-generated method stub
		computer.setPrice(6700);
	}

	@Override
	public Computer retrieveResult() {
		// TODO Auto-generated method stub
		return computer;
	}

}
