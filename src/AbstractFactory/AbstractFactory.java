package AbstractFactory;



//������������ҪĿ������Producer���ȡ������ʱ���ܹ�ͳһ��ȡ����AbstractFactory����ͨ���ַ���ѡ��ȷ������
public abstract class AbstractFactory {
	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	}