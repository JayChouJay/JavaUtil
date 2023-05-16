package thread.mythread;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                System.out.println("2你真棒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
