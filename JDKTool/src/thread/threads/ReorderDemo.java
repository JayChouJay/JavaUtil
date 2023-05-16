package thread.threads;

/**
 * 有序性：指令重排
 */
public class ReorderDemo {
    //加volatile能防止指令重排
    static int x = 0, y = 0;
    static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            reorder();
        }
    }

    static void reorder() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            a = 1;//操作1
            x = b;//操作2
        });
        Thread t2 = new Thread(() -> {
            b = 1;//操作3
            y = a;//操作4
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        if (x == 0 && y == 0) {
            System.out.println("(" + x + "," + y + ")");
        }
        x = 0;
        y = 0;
        a = 0;
        b = 0;
    }
}
