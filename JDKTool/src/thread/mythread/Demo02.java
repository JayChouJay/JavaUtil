package thread.mythread;

/**
 * 线程的实现方式2：实现Runnable接口
 */
public class Demo02 implements Runnable {
    @Override
    public void run() {
        System.out.println("my runnable running...");
    }
}

class Thread2 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        Thread thread = new Thread(demo02);
        thread.start();
        System.out.println(String.class.getClassLoader());
    }
}