package mystruct.queue;

public interface Deque<E> {
    /**
     * 头部插入
     * @param obj
     * @return
     */
    boolean addFirst(Object obj);
    boolean offerFirst(Object obj);

    /**
     * 头部删除
     * @return
     */
    E removeFirst();
    E pollFirst(Object obj);

    /**
     * 头部获取
     * @return
     */
    E getFirst();
    E peekFirst();

    /**
     * 尾部插入
     * @param obj
     * @return
     */
    boolean addLast(Object obj);
    boolean offerLast(Object obj);

    /**
     * 尾部删除
     * @return
     */
    E removeLast();
    E pollLast(Object obj);

    /**
     * 尾部获取
     * @return
     */
    E getLast();
    E peekLast();
}
