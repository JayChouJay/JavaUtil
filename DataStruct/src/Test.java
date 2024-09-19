import java.io.Serializable;
import java.util.Arrays;

public class Test{
    public int a = 1;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test te = new Test();
        Test test = (Test)te.clone();
        System.out.println(test.a);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
