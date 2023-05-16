package create.singleton;

/**
 * 1.单例模式只能有一个实例
 * 2.单例类必须自己创建自己的唯一实例。
 * 3.单例类必须给所有其他对象提供这一实例。
 */
public class Singleton {
    /**
     * 最重要的点就是将构造函数私有化
     */
    private Singleton() {
    }

    /**
     * 定义一个成员变量
     */
    private static Singleton singleton;
    //对外提供静态方法获取该对象
    public static synchronized Singleton create() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
