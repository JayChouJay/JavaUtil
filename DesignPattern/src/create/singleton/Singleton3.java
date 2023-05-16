package create.singleton;

/**
 * 双检锁模式
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) { // 注意这里是类级别的锁
                if (instance == null) {       // 这里的检测避免多线程并发时多次创建对象
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
