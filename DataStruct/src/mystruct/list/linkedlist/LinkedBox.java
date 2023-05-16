package mystruct.list.linkedlist;

import mystruct.bean.Node;
import mystruct.myexception.BoxIndexOutOfBoundsException;

import java.util.*;
import java.util.function.Consumer;

/**
 * 功能描述：ArrayBox不适合插入删除元素
 */
public class LinkedBox<T> {
    private Node first;
    private int size;
    private Node last;

    public void add(Object obj) {
        Node target = new Node(obj);
        if (first == null) first = target;
        last.next = target;
        size++;
    }

    public void addAll() {

    }

    public void insert(Object obj, int index) {
        Node cur = first;
        for (int i = 1; i <= index; i++) {
            cur = cur.next;
        }
        Node temp = cur.next;
        cur.next = new Node(obj);
        cur.next.next = temp;
        size++;
    }
}
