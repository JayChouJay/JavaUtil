package mystruct.queue.impl;

import mystruct.bean.Node;

/**
 * 双端队列(double ended Queue)
 * @param <E>
 */
class MyDeque<E> {
    //头尾结点
    private Node<E> head;
    private Node<E> tail;
    private int maxSize;
    private int size;

    public MyDeque(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * 存入
     * @param obj
     * @throws Exception
     */
    public void push(Object obj) throws Exception {
        if (size >= maxSize) {
            throw new Exception("满了");
        }
        Node<E> newNode = new Node(obj);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    /**
     * 取出
     * @return
     * @throws Exception
     */
    public E pop() throws Exception {
        if (size <= 0) {
            throw new Exception("空的");
        }
        E result = head.val;
        head = head.next;
        size--;
        return result;
    }
}
