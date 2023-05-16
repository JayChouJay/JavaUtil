package mystruct.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 通过单向队列实现栈
 */
public class MyStackByQueue2 {
    Queue<Integer> dataQueue = new LinkedList<>();
    Queue<Integer> tempQueue = new LinkedList<>();
    //记录栈顶元素
    int top;

    public MyStackByQueue2() {

    }

    public void push(int x) {
        dataQueue.offer(x);
        top = x;
    }

    public int pop() {
        while (dataQueue.size()>1) {
            top=dataQueue.peek();
            tempQueue.offer(dataQueue.poll());
        }
        int result = dataQueue.poll();
        Queue tmp = dataQueue;
        dataQueue = tempQueue;
        tempQueue = tmp;

        return result;
    }

    /**
     * 题目保证栈不为空，
     * @return
     */
    public int top() {
        return top;
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