package thread.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子性
 */
public class AtomicityDemo extends Thread {
    //没有原子性
    //private static int count;
    //底层乐观锁
    //还有Long,Boolean类型的
    private static AtomicInteger count = new AtomicInteger();

    private static void addCount() {
        for (int i = 0; i < 1000; i++) {
            //count++本身是3条指令
            //count++;
            count.incrementAndGet();
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        addCount();
    }

    public static void main(String[] args) throws InterruptedException {
        int len = 10;
        //10个线程
        AtomicityDemo[] arr = new AtomicityDemo[len];

        for (int i = 0; i < len; i++) {
            //初始化10个线程
            arr[i] = new AtomicityDemo();
        }
        for (int i = 0; i < len; i++) {
            //开启10个线程
            arr[i].start();
        }
        Thread.sleep(1000);
        System.out.println("count最终值：" + count);
    }
}
