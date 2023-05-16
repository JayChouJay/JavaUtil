package thread.threadpool;


import java.util.concurrent.*;

/**
 * 自定义线程池
 */
public class ThreadPool5 {
    /**
     * corePoolSize：核心线程数
     * maximumPoolSize：最大线程爽
     * keepAliveTime：空余时间
     * unit：时间单位
     * workQueue阻塞队列：存放还没执行的任务队列
     * Executors.defaultThreadFactory()创建线程的工厂
     * defaultHandler拒绝策略
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //初始化
        ExecutorService myPool = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //测试执行全部线程,超过等待队列的话会报异常（取决于拒绝策略）
        for (int i = 0; i < 19; i++) {
            int finalI = i;
            myPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"--->"+ finalI);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        Future<String> future = myPool.submit(new Callable<String>() {
            @Override
            public String call() throws InterruptedException {
                Thread.sleep(2000);
                return "测试 返回 字符串";
            }
        });

        Future future2 = myPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        });
        //get方法可以设置等待时间，不设置则等待完成
        String res = future.get();
        System.out.println("future:" + res);

        Object res2 = future2.get();
        System.out.println("future2:" + res2);
    }
}
