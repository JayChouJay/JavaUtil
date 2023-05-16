package create.singleton;

/**
 * 饿汉式
 * 优点：不需要加锁，性能高
 * 缺点：初始化类时就初始化实例，导致有时系统并不需要这个类，也进行了初始化，咋成空间浪费
 */
public class Singleton2 {
    /**
     * 最重要的点就是将构造函数私有化
     */
    private Singleton2() {
    }

    /**
     * 定义一个成员变量
     */
    private static Singleton2 singleton2 = new Singleton2();

    //对外提供静态方法获取该对象
    public static synchronized Singleton2 create() {
        return singleton2;
    }
}
