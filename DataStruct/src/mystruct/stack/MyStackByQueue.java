package mystruct.stack;

import java.util.LinkedList;

/**
 * 通过双向队列实现栈
 * 来源：leetcode-225
 */
public class MyStackByQueue {
    LinkedList<Integer> dataQueue = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    //记录栈顶元素
    int top;

    public MyStackByQueue() {

    }

    public void push(int x) {
        dataQueue.offer(x);
    }

    public int pop() {
        return dataQueue.pollLast();
    }

    public int top() {
        return dataQueue.peekLast();
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