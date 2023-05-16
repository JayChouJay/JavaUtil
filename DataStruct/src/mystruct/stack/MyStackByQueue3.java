package mystruct.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 通过单向队列实现栈
 */
public class MyStackByQueue3 {
    Queue<Integer> dataQueue = new LinkedList<>();

    public MyStackByQueue3() {

    }

    public void push(int x) {
        dataQueue.offer(x);
        int size = dataQueue.size();
        while (size > 1) {
            dataQueue.offer(dataQueue.poll());
            size--;
        }
    }

    public int pop() {
        return dataQueue.poll();
    }

    /**
     * 题目保证栈不为空，
     *
     * @return
     */
    public int top() {
        return dataQueue.peek();
    }

    public boolean empty() {
        return dataQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */