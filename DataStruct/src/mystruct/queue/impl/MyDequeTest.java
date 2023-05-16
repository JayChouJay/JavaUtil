package mystruct.queue.impl;

import org.junit.jupiter.api.Test;

public class MyDequeTest {
    @Test
    public void commons() throws Exception {
        MyDeque myDeque = new MyDeque(3);
        myDeque.push(1);
        myDeque.push(2);
        myDeque.push(3);
//        myQueue.push(4);
        System.out.println(myDeque.pop());
        System.out.println(myDeque.pop());
        System.out.println(myDeque.pop());
    }
}
