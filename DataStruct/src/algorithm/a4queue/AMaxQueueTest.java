package algorithm.a4queue;

import org.junit.jupiter.api.Test;

public class AMaxQueueTest {
    @Test
    public void maxQueue(){
        AMaxQueue queue=new AMaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
    }
    @Test
    public void maxQueue2(){
        AMaxQueue queue=new AMaxQueue();
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
    }
    @Test
    public void maxQueue3(){
        AMaxQueue queue=new AMaxQueue();
        queue.push_back(1);
        queue.push_back(2);
        queue.push_back(3);
        queue.push_back(3);
        queue.push_back(3);
        queue.push_back(3);
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
    }


    @Test
    public void maxQueue4(){
        AMaxQueue queue=new AMaxQueue();
        queue.push_back(3);
        queue.push_back(3);
        queue.push_back(1);
        queue.push_back(2);
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
        System.out.println("pop_front:\t"+queue.pop_front());
        System.out.println("max_value:\t"+queue.max_value());
    }
}