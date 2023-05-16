package mystruct.queue.impl;

/**
 * 循环链表
 * 数组实现
 */
public class MyCircularQueue {
    //存储元素的数组
    int[] queue;
    //最大容量
    int capacity;
    //头指针
    int head;
    //实际队列长度
    int count;


    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[k];
        head = 0;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        int index = (head + count) % capacity;
        queue[index] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[head];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        int tail = (head + count - 1) % capacity;
        return queue[tail];

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */