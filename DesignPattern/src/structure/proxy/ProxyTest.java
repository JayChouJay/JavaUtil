package structure.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    public void test() {
        //公鸡
        Chicken cock = new Cock();
        //公鸡叫声
        cock.call();
        //公鸡行为
        cock.behavior();
        System.out.println("=================");
        //其他种类的鸡
        Chicken ikun = new IkunCock();
        ikun.call();
        ikun.behavior();
    }

    @Test
    public void proxy() {
        //公鸡
        Chicken cock = new ChickenProxy(new Cock());
        //公鸡叫声
        cock.call();
        //公鸡行为
        cock.behavior();
        System.out.println("=================");
        //其他种类的鸡
        Chicken ikun = new ChickenProxy(new IkunCock());
        ikun.call();
        ikun.behavior();
    }

    @Test
    public void jdkProxy() {
        //公鸡
        Chicken cock = CustomLogInvocationHandler.createProxy(new Cock(), Chicken.class);
        //公鸡叫声
        cock.call();
        //公鸡行为
        cock.behavior();
        System.out.println("=================");

        //其他种类的鸡
        Chicken ikun = CustomLogInvocationHandler.createProxy(new IkunCock(), Chicken.class);
        ikun.call();
        ikun.behavior();
    }
}
