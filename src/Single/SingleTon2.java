package Single;

/**
 * �̰߳�ȫ����ʽ��lazyingloading  ������Ҫ������Ч�ʵͣ�ʹ����
 * @author Administrator
 *
 */
public class SingleTon2
{  
    private static SingleTon2 instance;  
    private SingleTon2 (){}  
    public static synchronized SingleTon2 getInstance() {  
    if (instance == null) {  
        instance = new SingleTon2();  
    }  
    return instance;  
    }  
} 