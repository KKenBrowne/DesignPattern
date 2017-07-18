package Decorator;


public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
	}
	
	@Override
	public void draw(){
		decoratorShape.draw();	
		
		//�¹���
	    setRedBorder(decoratorShape);
	}
	
	private void setRedBorder(Shape decoratorShape){
	      System.out.println("Border Color: Red");
	   }

}