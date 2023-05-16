package collections.list;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    //初始化
    private final List<String> LIST = Arrays.asList("周杰伦", "林俊杰", "张国荣");

    /**
     * 测试Lambda表达式
     */
    @Test
    public void foreach() {
        System.out.println(LIST);
    }

}
