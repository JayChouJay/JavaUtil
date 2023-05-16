import org.junit.jupiter.api.Test;

public class RuntimeTest {
    @Test
    public void commons() {
        //构建对象
        Runtime runtime = Runtime.getRuntime();
        //虚拟机最大容量（可用+保留）
        long max = runtime.maxMemory();
        //可用总容量
        long total = runtime.totalMemory();
        //目前空闲容量
        long free = runtime.freeMemory();

        System.out.println("1.:\t" + max);
        System.out.println("2.:\t" + total);
        System.out.println("3.:\t" + free);
    }
}
