package BuliderPattern;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

public class Test {
	public static void main(String[] args) {
		Builder builder = new ConcreteBulider();
		
		Computer computer = builder.retrieveResult();
		
		Director director = new Director(builder);
		
		director.construct();
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		
	}

}
