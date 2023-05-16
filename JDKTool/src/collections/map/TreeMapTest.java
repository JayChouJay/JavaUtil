package collections.map;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {
    private TreeMap treeMap = new TreeMap();

    {
        treeMap.put(1, 3);
        treeMap.put(2, 3);
        treeMap.put(3, 3);
        treeMap.put(4, 3);
        treeMap.put(0, 3);
    }

    @Test
    public void commons() {
        System.out.println("1.重写了toString方法：\t" + treeMap.toString());
        treeMap.entrySet();
        treeMap.keySet();
        Iterator it = treeMap.entrySet().iterator();
    }
}
