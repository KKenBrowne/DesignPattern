package Single;

/**
 * 线程安全懒汉式，lazyingloading  但是需要加锁，效率低，使用少
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