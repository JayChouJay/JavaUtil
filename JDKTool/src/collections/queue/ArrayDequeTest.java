package collections.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayDequeTest {
    ArrayDeque arrayDeque=new ArrayDeque();
    {
        arrayDeque.add(1);
    }
    @Test
    public void commons(){
        System.out.println(arrayDeque.peek());

        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());
    }
}
