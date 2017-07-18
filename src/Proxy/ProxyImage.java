package Proxy;

public class ProxyImage implements Image{
	private String fileName;
	private  RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
		
	}

	//代理模式，对REALIMAGE加以控制，这里的控制跟缓存很像，如果已经存在，就直接用代理的，如果没有，就先从源文件拿一个过来
	@Override
	public void display() {
		if(realImage==null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
		
	}

}
