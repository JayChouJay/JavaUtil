package thread.threadpool;

import java.util.concurrent.*;

/**
 * 计划任务线程池
 */
public class ThreadPool4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //初始化
        ScheduledExecutorService pool2 = Executors.newScheduledThreadPool(10);
        pool2.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("ScheduledExecutorService");
            }
        }, 3, TimeUnit.SECONDS);
    }
}
