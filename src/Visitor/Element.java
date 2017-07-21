package Visitor;

//³éÏóÔªËØÀà
public abstract class Element {
	public abstract void accept(IVisitor ivisitor);
	public abstract void doSomething();

}
