package thread.mythread;

public class ThreadTest {

    public void threadTest() {
        new ThreadOne().start();
        new ThreadTwo().start();
    }

    public static void main(String[] args) {
        new ThreadTest().threadTest();
    }

}
