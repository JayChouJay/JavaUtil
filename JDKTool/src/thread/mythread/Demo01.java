package thread.mythread;

/**
 * 线程的实现方式1：继承Thread类
 */
public class Demo01 extends Thread {
    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        createThread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("hahha");
        }
    }
}

class CreateThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}