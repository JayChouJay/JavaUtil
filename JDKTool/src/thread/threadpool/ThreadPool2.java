package thread.threadpool;


import java.util.concurrent.*;
/**
 * 定长线程池
 */
public class ThreadPool2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //初始化
        ExecutorService pool = Executors.newFixedThreadPool(10);

        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("定长线程池");
            }
        });
    }
}
