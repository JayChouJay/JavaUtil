package collections.list;

import com.sun.org.apache.xpath.internal.objects.XObject;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 继承AbstractList
 * 增加到后扩容，删除后后面的补到前面
 */
public class ArrayListTest {
    //初始化
    //无参数的构造方法
    private ArrayList arrayList = new ArrayList();
    //泛型初始化
    private ArrayList<String> arrayList2 = new ArrayList<>();
    //带默认容量的构造方法
    private ArrayList<String> arrayList4 = new ArrayList<>(1);
    //传List初始化（将Collection家族传入）
    private ArrayList arrayList3 = new ArrayList(arrayList);

    {
        arrayList.add(null);
        arrayList.add(null);
    }

    @Test
    public void commons() {
        //存
        arrayList.add(1);
        arrayList.add("abc");
        arrayList.add("abc");
        //删除一个--索引，对象
        arrayList.remove(1);
        arrayList.remove("abc");
        //改指定位置的值
        arrayList.set(2, "ccc");
        //查值
        Object index2 = arrayList.get(2);

        //并集
        arrayList.addAll(arrayList2);
        //差集
        arrayList.removeAll(arrayList2);
        //交集
        arrayList.retainAll(arrayList2);

        //查询数据第一次出现的索引
        arrayList.indexOf(2);
        //查询数据最后一次出现的索引
        arrayList.lastIndexOf(2);
        //查询集合是否包含数据
        arrayList.contains(2);
        //取出指定位置
        List list = arrayList.subList(1, 2);
        //判断是否为空
        arrayList.isEmpty();
        //清空
        arrayList.clear();
        //判断是否需要扩容
        arrayList.ensureCapacity(16);
        //迭代器
        Iterator iterator = arrayList.iterator();
        Object[] objs = null;
        arrayList.toArray(objs);
        arrayList.trimToSize();

        //遍历测试
        for (Object val : arrayList) {
            System.out.println(val);
        }
    }
}
