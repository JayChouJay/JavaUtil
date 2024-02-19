import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class Test {
    @org.junit.jupiter.api.Test
    public void errorProne() {
        byte b1 = (byte) 1000;
        System.out.println("b1:" + b1);
        float f1 = 21474836471f;
        System.out.println("f1:" + f1);
        switch ("周杰伦") {
            case "周杰伦":
                System.out.println("正确");
                break;
            case "周星驰":
            default:
                System.out.println("不是周杰伦");
        }
    }

    @org.junit.jupiter.api.Test
    public void commons() {
        List<Integer> numbers = new ArrayList<>();

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
    }

    @org.junit.jupiter.api.Test
    public void testClassLoader() throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class myClass = myClassLoader.loadClass("java.lang.String");
        System.out.println(myClass.getName());
    }

}
