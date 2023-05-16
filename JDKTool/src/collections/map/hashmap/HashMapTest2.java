package collections.map.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * hash冲突
 */
public class HashMapTest2 {
    // 初始化-1.无参
    private HashMap<String, String> hashMap = new HashMap<>();

    {
        //存值
        hashMap.put("key1", "val1");
        hashMap.put("key2", "val2");
        hashMap.put("key3", "val3");
    }

    /**
     * 常用方法-核心方法
     */
    @Test
    public void commons() {
        //1.改值
        //重复存入key会覆盖
        hashMap.put("key2", "val22");
        //2.取值
        hashMap.get("key1");
        //3.移除
        hashMap.remove("key4");
        //4.获取map的长度
        hashMap.size();
        //5.替换
        hashMap.replace("key1", "val11");
    }

    /**
     * 一般常用方法
     */
    @Test
    public void commons2() {
        //5.获取全部的key
        hashMap.keySet();
        //获取全部的entry(Node)对象
        hashMap.entrySet();
        //存入其他对象
        hashMap.putAll(hashMap);
        hashMap.clear();
        hashMap.containsKey("key");
        hashMap.containsValue("key2");
        hashMap.isEmpty();
        //若key存在就返回value，若不存在则返回defaultValue
        String value = hashMap.getOrDefault("key1", "val");
        //key若不存在就存入，存在就放弃
        String val = hashMap.putIfAbsent("key", value);
        //hashMap重写了toString方法。输出hashMap元素
        System.out.println("11.AbstractMap重写了toString方法:\t" + hashMap.toString());

    }

    @Test
    //遍历 Iterating entries using a For Each loop
    public void entryForeach() {
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    @Test
    //遍历 迭代键，迭代值
    public void keySetForeach() {
        // 迭代键
        for (String key : hashMap.keySet()) {
            System.out.println("Key = " + key);
        }
        // 迭代值
        for (String value : hashMap.values()) {
            System.out.println("Value = " + value);
        }
    }

    @Test
    //使用带泛型的迭代器进行遍历
    public void IteratorForeach() {
        Iterator<Map.Entry<String, String>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    @Test
    //通过Java8 Lambda表达式遍历
    public void lambdaForeach() {
        hashMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }
}
