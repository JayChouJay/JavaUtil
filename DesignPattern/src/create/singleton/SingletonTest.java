package create.singleton;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void getSingleton() {
        //获取实例1
        Singleton s1 = Singleton.create();
        //获取实例2
        Singleton s2 = Singleton.create();
        //判断两个实例是否为同一个
        System.out.println(s1 == s2);
    }
}
