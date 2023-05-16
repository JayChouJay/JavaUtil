package algorithm.a2list.list02doubly;

/**
 * 双向链表
 */
public class Node<E> {
    private Node<E> pre;
    private E Obj;
    private Node<E> next;

    public Node(Node<E> pre, E obj, Node<E> next) {
        this.pre = pre;
        Obj = obj;
        this.next = next;
    }
}
