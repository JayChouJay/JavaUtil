package mystruct.queue.impl;

import org.junit.jupiter.api.Test;

public class MyArrayQueueTest {
    MyArrayQueue queue=new MyArrayQueue(12);
    {
        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
    }
    @Test
    public void commons(){
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
