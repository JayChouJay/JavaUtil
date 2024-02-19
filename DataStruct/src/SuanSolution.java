import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SuanSolution {
    public static void main(String[] args) {
        System.out.println(Test.class.getClassLoader().getParent().toString());
    }
}