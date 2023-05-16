package collections.set;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 * <p>
 * 实现：TreeMap
 * 无重复原则：compareTo方法
 * <p>
 * 上述这个方法不是每一个对象都有
 * 若想要将某一个对象存入TreeSet中，需要将对象所属的类实现接口Comparable
 * 实现接口后将compareTo方法重写 返回值int 负数靠前排布，整数排列靠后
 */
public class TreeSetTest {
    //初始化
    private TreeSet treeSet = new TreeSet();
    private TreeSet treeSet2 = new TreeSet(new HashSet());

    {
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("3");
        treeSet.add("2");
    }

    // 顺序遍历TreeSet
    public static void ascIteratorThroughIterator(TreeSet set) {
        System.out.print("\n ---- Ascend Iterator ----\n");
        for (Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.printf("asc : %s\n", iter.next());
        }
    }

    // 逆序遍历TreeSet
    public static void descIteratorThroughIterator(TreeSet set) {
        System.out.printf("\n ---- Descend Iterator ----\n");
        for (Iterator iter = set.descendingIterator(); iter.hasNext(); )
            System.out.printf("desc : %s\n", (String) iter.next());
    }

    // 通过for-each遍历TreeSet。不推荐！此方法需要先将Set转换为数组
    private static void foreachTreeSet(TreeSet set) {
        System.out.printf("\n ---- For-each ----\n");
        String[] arr = (String[]) set.toArray(new String[0]);
        for (String str : arr)
            System.out.printf("for each : %s\n", str);
    }

    @Test
    @DisplayName("遍历测试")
    public void foreach() {
        ascIteratorThroughIterator(treeSet);
    }
}
