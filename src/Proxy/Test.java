package Proxy;

public class Test {
	
	   public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      //ͼ�񽫴Ӵ��̼���
	      image.display(); 
	      System.out.println("");
	      //ͼ�񽫲��ôӴ��̼���
	      image.display(); 	
	   }
	}