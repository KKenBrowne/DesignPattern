package Visitor;

//����Ԫ����
public abstract class Element {
	public abstract void accept(IVisitor ivisitor);
	public abstract void doSomething();

}
