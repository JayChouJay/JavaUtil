package mystruct.queue.impl;

/**
 * 数组实现队列
 */
public class MyArrayQueue<E> {
    //最大容量
    int maxCapacity;

    //声明头尾指针
    int head;
    int tail;
    //存元素
    private Object[] arr;

    public MyArrayQueue(int maxCapacity) {
        arr = new Object[maxCapacity];
        this.maxCapacity = maxCapacity;

        head = 0;
        tail = 0;
    }

    /**
     * 判断队列是否满了
     *
     * @return
     */
    public boolean isFull() {
        return tail == arr.length - 1;
    }

    /**
     * 存值
     *
     * @param n
     * @return
     */
    public boolean offer(int n) {
        if (!isFull()) {
            arr[tail++] = n;
            return true;
        }
        return false;
    }


    /**
     * 取，并删除
     *
     * @return
     */
    public E poll() {
        Object h = arr[head];
        //判断是否为空
        if (h == null) return null;
        arr[head] = null;
        head++;
        return (E) h;
    }
}
