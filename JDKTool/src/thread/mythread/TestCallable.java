package thread.mythread;

import java.util.concurrent.*;

/**
 * 线程的实现方式3：实现Callable接口
 */

public class TestCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("thread创建成功....");
        return true;
    }

    public static void main(String[] args) {
        TestCallable callable = new TestCallable();
        //创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> result = service.submit(callable);
        try {
            boolean isTrue = result.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdownNow();
    }
}