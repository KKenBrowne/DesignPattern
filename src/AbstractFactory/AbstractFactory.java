package AbstractFactory;



//创建这个类的主要目的是在Producer类获取工厂的时候能够统一获取对象AbstractFactory，并通过字符串选择确定工厂
public abstract class AbstractFactory {
	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	}