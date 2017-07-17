package AbstractFactory;

public class Tst {
	public static void main(String[] args) {
		AbstractFactory s1 = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = s1.getShape("RECTANGLE");
		shape1.draw();
	}

}
