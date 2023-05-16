package packagingclass;

import org.junit.jupiter.api.Test;


/**
 * Integer
 * Integer底层有一个静态数组，存储-128-127
 */
public class IntegerTest {
    //初始化
    //会调用valueOf方法装箱
    private Integer val1 = 1000;
    private Integer val2 = 1000;
    private Integer val3 = new Integer(1000);
    private Integer val4;
    private Integer val5 = new Integer(100);
    private Integer val6 = new Integer(100);

    public void test(Integer val) {
        System.out.println(System.identityHashCode(val));
        val += 1;
        System.out.println("Integer的最大值：" + Integer.MAX_VALUE);
        System.out.println("Integer的最小值：" + Integer.MIN_VALUE);
    }

    @Test
    public void compare() {
        System.out.println("val1==val2:" + (val1 == val2));
        System.out.println("val1==val3:" + (val1 == val3));
        System.out.println("val5==val6:" + (val5 == val6));
        System.out.println("val5==val3:" + (val5 == val3));

        System.out.println("val1==val2:" + (val1.equals(val2)));

    }

    @Test
    public void common() {
        Integer val1 = Integer.parseInt("123");
        System.out.println("字符串转Int：\t" + val1);
        //拆箱
        //自动调用intValue方法
        int i = val1;
//        int j = val4;
        System.out.println(val4);
    }

    /**
     * 包装类的引用传递
     * 由于Integer底层存的int 是final修饰的，在方法中改值会导致重新创建对象，并返回引用
     * 所以原有引用下的内容并未改变
     */
    @Test
    public void test() {
        System.out.println(System.identityHashCode(val1));
        test(val1);
        System.out.println(val1);
    }
}
