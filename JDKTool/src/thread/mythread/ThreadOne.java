package thread.mythread;

/**
 * 线程的实现方式1：继承Thread类
 */
public class ThreadOne extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                System.out.println("1你真棒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
