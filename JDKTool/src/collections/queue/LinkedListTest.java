package collections.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    private Queue queue = new LinkedList();

    {
        //添加元素
        queue.add("1");
        queue.add(2);
        //如果队列满了，add会抛出异常，offer会返回false，更健壮更友好
        queue.offer(3);
    }

    @Test
    public void commons() {
        System.out.println("2.获取顶部的一个对象:\t" + queue.peek());
        System.out.println("4.重写了toString方法：\t" + queue);
        queue.addAll(queue);
        //只获取头元素，不取出
        //当队列为空时，element会抛出异常，peek会返回null
        queue.peek();
        queue.element();

        //获取队头元素 同时取出
        //当队列为空时，remove会抛出异常，poll会返回null
        queue.poll();
        queue.remove();

    }
}
