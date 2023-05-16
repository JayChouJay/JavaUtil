package algorithm.a3stack;

import java.util.Stack;

/**
 * 最小栈
 * 方式二
 */
public class AMinStack2 {
    //数据栈
    Stack<Integer> dataStack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public AMinStack2() {

    }

    public void push(int val) {
        //如果新元素使最小值发生变化，则会存储两个值（原来的最小值，当前的最小值）
        if (min >= val) {
            //如果栈为空 说明是第一个元素 此时一定是min>x
            if (!dataStack.isEmpty()) {
                dataStack.push(min);
            }
            //最小值重新赋值
            min = val;
        }
        dataStack.push(val);
    }

    public void pop() {
        if (dataStack.isEmpty()) return;
        if (dataStack.size() == 1) {
            min = Integer.MAX_VALUE;
        } else if (min == dataStack.peek()) {
            dataStack.pop();
            min = dataStack.peek();
        }
        //如果移除的不是最小值 直接pop
        //如果移除的是最小值 前面移除一次 在移除之前保存的最小值
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return min;
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
