package collections.queue;

import org.junit.jupiter.api.Test;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueT {
    Queue queue = new LinkedBlockingDeque();

    {
        //初始化队列
        for (int i = 0; i < 5; i++) {
            //存
            queue.offer(i);
        }
    }

    @Test
    public void foreach() {
        System.out.println("-------1-----");
        //集合方式遍历，元素不会被移除
        for (Object x : queue) {
            System.out.println(x);
        }
        System.out.println("-------2-----");
        //队列方式遍历，元素逐个被移除
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
