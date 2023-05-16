package mystruct.queue.impl;

import org.junit.jupiter.api.Test;

public class MyQueueWithStackTest {
    @Test
    public void commons() throws Exception {
        MyQueueWithStack queue=new MyQueueWithStack(3);
        queue.push(1);
        queue.push(2);
        queue.push(3);
//        queue.push(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
//        System.out.println(queue.pop());
    }
}
