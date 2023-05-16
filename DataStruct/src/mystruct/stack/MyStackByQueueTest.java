package mystruct.stack;

import org.junit.jupiter.api.Test;

public class MyStackByQueueTest {
    @Test
    public void myStackByQueue(){
        MyStackByQueue2 queue2=new MyStackByQueue2();
        queue2.push(1);
        System.out.println(queue2.pop());
        System.out.println(queue2.top());
        System.out.println(queue2.empty());
    }
    @Test
    public void myStackByQueue2(){
        MyStackByQueue2 queue2=new MyStackByQueue2();
        queue2.push(1);
        queue2.push(2);
        System.out.println(queue2.top());
        System.out.println(queue2.pop());
        System.out.println(queue2.empty());
    }
}
