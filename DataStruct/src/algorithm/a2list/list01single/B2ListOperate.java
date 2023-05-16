package algorithm.a2list.list01single;

import mystruct.bean.Node;

public class B2ListOperate {
    //有序链表合并
    public static Node mergeLinked(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        Node result;
        Node tail;
        if ((int) a.val <= (int) b.val) {
            result = a;
            a = a.next;
        } else {
            result = b;
            b = b.next;
        }
        tail = result;
        while (a != null || b != null) {
            if (b == null || a != null && (int) a.val <= (int) b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        return result;
    }

    /**
     * 普通迭代
     */
    public static void reverse(Node node) {
        Node pre = null;
        Node cur = node;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
    }

    /**
     * 链表逆置
     * 递归
     */
    public static void reverse2(Node node) {
        if (node.next.next != null) {
            reverse(node.next);
        }
        node.next.next = node;
        node.next = null;
    }

    public static int sum(Node node) {
        if (node.next != null) {
            return (int) node.val + sum(node.next);
        } else
            return (int) node.val;
    }
}
