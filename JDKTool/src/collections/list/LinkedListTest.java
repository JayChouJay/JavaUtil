package collections.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTest {
    private LinkedList list = new LinkedList();

    {
        //存
        list.add("1");
        list.add("2");
        list.add("8");
        list.add("9");
        list.add("1");
        list.add(1);
        //如果队列满了，add会抛出异常，offer会返回false，更健壮更友好
        list.offer(1);
    }

    @Test
    public void commons() {
        System.out.println("1.取值：\t" + list.get(3));
        System.out.println("2.获取顶部的一个对象:\t" + list.peek());
        System.out.println("4.重写了toString方法：\t" + list);
        list.addAll(list);

    }
}
