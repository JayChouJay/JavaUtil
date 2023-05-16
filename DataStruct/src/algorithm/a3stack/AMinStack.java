package algorithm.a3stack;

import java.util.Stack;

/**
 * 最小栈
 * 来源：leetCode-155
 * 方式一
 */
public class AMinStack {
    //数据栈
    Stack<Integer> dataStack = new Stack<>();
    //存储最小值的额外栈
    Stack<Integer> minStack = new Stack<>();

    public AMinStack() {

    }

    public void push(int val) {
        dataStack.push(val);
        //比较新元素 和minStack中栈顶元素（之前所有元素的最小值）谁更小
        if (!minStack.isEmpty() && minStack.peek() < val) {
            //如果栈顶元素更小，在存进栈一次
            minStack.push(minStack.peek());
        } else {
            minStack.push(val);
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();

    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
