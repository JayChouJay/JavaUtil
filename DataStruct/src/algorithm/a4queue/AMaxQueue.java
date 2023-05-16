package algorithm.a4queue;

import java.util.LinkedList;

/**
 * 队列的最大值
 * <p>
 * 来源：LeetCode-剑指Offer 59 II
 * <p>
 * 定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * <p>
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * <p>
 * 输入:
 * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
 * <p>
 * [[],[1],[2],[],[],[]]
 * <p>
 * 输出: [null,null,null,2,1,2]
 */
public class AMaxQueue {
    //原始队列
    LinkedList<Integer> queue;
    //最大值候选队列
    LinkedList<Integer> max;

    public AMaxQueue() {
        queue = new LinkedList<>();
        max = new LinkedList<>();
    }

    /**
     * 获取最大值
     * @return
     */
    public int max_value() {
        if (max.isEmpty()) {
            return -1;
        }
        return max.peekFirst();
    }

    /**
     * 尾部插入
     * @param value
     */
    public void push_back(int value) {
        queue.offer(value);

        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.add(value);
    }

    /**
     * 头部删除
     * @return
     */
    public int pop_front() {
        //如果删除的元素是最大值，从max队列中同时删掉
        if (!max.isEmpty() && queue.peekFirst().equals(max.peekFirst())) {
            max.pollFirst();
        }
        if (queue.isEmpty())
            return -1;
        return queue.poll();
    }
}
/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */