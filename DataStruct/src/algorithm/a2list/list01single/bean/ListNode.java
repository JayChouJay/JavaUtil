package algorithm.a2list.list01single.bean;

public class ListNode<T> {
    //数据
    public T data;
    //下一个节点的引用
    public ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }

    //引用数组 转化成 链表
    public static <T> ListNode<T> arrayToListNode(T[] arr) {
        if (arr.length == 0) return null;
        //初始化头结点
        ListNode<T> root = new ListNode<T>(arr[0]);
        //记录尾结点
        ListNode<T> pre = root;
        for (int i = 1; i < arr.length; i++) {
            ListNode<T> node = new ListNode<T>(arr[i]);
            //插入后继节点
            pre.next = node;
            //更新尾结点
            pre = node;
        }
        return root;
    }

    //int数组 转化成 链表
    public static ListNode arrayToListNode(int[] arr) {
        if (arr.length == 0) return null;
        //初始化头结点
        ListNode root = new ListNode(arr[0]);
        //记录尾结点
        ListNode pre = root;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            //插入后继节点
            pre.next = node;
            //更新尾结点
            pre = node;
        }
        return root;
    }

    /**
     * 打印一个链表
     * 不能打印循环链表
     *
     * @param head
     */
    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }

    /**
     * 链表加环
     */
    public static void toCycle(ListNode node, int pos) {
        ListNode posNode = node;

        while (node.next != null) {
            node = node.next;
        }
        for (int i = 0; i < pos; i++) {
            posNode = posNode.next;
        }
        node.next = posNode;
    }

    public static void toCycle2(ListNode node, int pos) {
        int index = 0;
        ListNode posNode = node;
        while (node != null) {
            //判断是否是入口节点
            if (index == pos) {
                posNode = node;
            }
            index++;
            node = node.next;
        }
        //尾结点指向入口节点
        node.next = posNode;
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                '}';
    }
}
