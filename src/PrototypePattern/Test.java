package PrototypePattern;

public class Test {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape cloneShape = (Shape)ShapeCache.getShape("1");
		System.out.println(cloneShape.getType());
	}

}
