package algorithm.a2list.list01single;

import algorithm.a2list.list01single.bean.ListNode;

/**
 * 链表中倒数第k个节点
 * 来源：Leetcode-剑指offer-22
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * <p>
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 */
public class AGetKthFromEnd {
    //获取倒数第k个节点
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode current = head;
        //初始化链表长度
        int len = 1;
        //找到链表总长度len
        while (current.next != null) {
            current = current.next;
            len++;
        }

        current = head;
        //遍历到倒数第k个节点
        for (int i = 1; i <= len - k; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * 快慢指针
     */
    public static ListNode getKthFromEnd2(ListNode head, int k) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
