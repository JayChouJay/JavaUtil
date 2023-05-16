package mystruct.queue.impl;

import mystruct.stack.Mystack;

/**
 * 队列
 * 栈实现队列，底层数组
 * @param <E>
 */
public class MyQueueWithStack<E> {
    private Mystack mystack1;
    private Mystack mystack2;
    private int size;

    public MyQueueWithStack(int size) {
        mystack1 = new Mystack(size);
        mystack2 = new Mystack(size);
    }

    public void push(Object val) throws Exception {
        mystack1.push(val);
        size++;
    }

    public E pop() throws Exception {
        while (!mystack1.isEmpty()) {
            mystack2.push(mystack1.pop());
        }
        Object result = mystack2.pop();
        while (!mystack2.isEmpty()) {
            mystack1.push(mystack2.pop());
        }
        size--;
        return (E) result;
    }
}
