package Decorator;

//1��Component ��䵱�����ɫ����Ӧ�þ���ʵ�֡� 2�����������úͼ̳� Component �࣬������չ����д���෽����
public abstract class ShapeDecorator implements Shape{
	protected Shape decoratorShape;
	
	public ShapeDecorator(Shape decoratorShape){
		this.decoratorShape = decoratorShape;
	}
	
	public void draw(){
		decoratorShape.draw();
	}
	

}
