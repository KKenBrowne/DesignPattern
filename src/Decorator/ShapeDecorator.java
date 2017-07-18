package Decorator;

//1、Component 类充当抽象角色，不应该具体实现。 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape){
		this.decoratorShape = decoratorShape;
	}
	
	public void draw(){
		decoratorShape.draw();
	}
	

}
