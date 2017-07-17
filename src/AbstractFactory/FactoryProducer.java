package AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String s){
		if(s.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		else if(s.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}

}
