package thread.threadlocal;

import org.junit.jupiter.api.Test;


/**
 * ThreadLocal
 * 自身存在ThreadLocalMap中
 */
public class ThreadLocalTest {
    @Test
    public void threadLocalTest() {
        //获取对象
        ThreadLocal local = ThreadLocalManager.getThreadLocal("name");

        //初始化
        ThreadLocal local1=new ThreadLocal();
        //存值
        local.set("1");
        //获取
        local.get();
        //移除
        //local.remove();
        System.out.println(local.get());

    }

}
