package thread.threadpool;

import java.util.concurrent.*;

/**
 * 单线程线程池
 */
public class ThreadPool3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //初始化
        ExecutorService pool = Executors.newSingleThreadExecutor();

        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("单线程线程池");
            }
        });
    }
}
