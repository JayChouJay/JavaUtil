package thread.threadpool;


import java.util.concurrent.*;
/**
 * 可缓存线程池
 */
public class ExecutorServiceThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //初始化
        ExecutorService pool = Executors.newCachedThreadPool();

        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("可缓存线程池");
            }
        });
    }
}
