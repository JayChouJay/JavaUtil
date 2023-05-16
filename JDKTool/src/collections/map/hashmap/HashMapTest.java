package collections.map.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap-初始化
 * hash冲突
 */
public class HashMapTest {
    // 初始化-1.无参
    private HashMap<String, String> hashMap = new HashMap<>();

    {
        //存值
        hashMap.put("key1", "val1");
        hashMap.put("key2", "val2");
        hashMap.put("key3", "val3");
    }

    /**
     * 指定默认容量16，但是不做初始化
     */
    public void init() {
        //初始化-2.无泛型
        HashMap hashMap1 = new HashMap<>();
    }

    /**
     * 1.校验初始化容量是否合法
     * <p>
     * 2.通过位运算，算出最接近传入容量的次幂数
     */
    public void init2() {
        //初始化-3.带默认容量
        HashMap<String, String> hashMap2 = new HashMap<>(1);
    }

    /**
     * 传入初始化容量，并指定扩容因子
     */
    public void init3() {
        //初始化-4.带默认容量和扩容因子
        HashMap<String, String> hashMap3 = new HashMap<>(1, 1);
    }

    /**
     *
     */
    public void init4() {
        //初始化-5.解析其他map
        HashMap<String, String> hashMap4 = new HashMap<>(hashMap);
    }

    public void init5() {
        //集合的key和value都不能是基础类型
        //private HashMap<String, int> hashMap = new HashMap<>();
    }
}
