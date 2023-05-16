package algorithm.a2list.list03circular;

import algorithm.a2list.list01single.bean.ListNode;

/**
 * 环形链表
 * <p>
 * 来源：LeetCode-141
 * <p>
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 * <p>
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class AHasCycle {
    /**
     * 判断是否有环
     * 1.可以采用set记录每个节点
     * <p>
     * 2.快慢指针
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        //链表本身为空或者链表只有一个节点，都是是无环的
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 环形链表2
     * <p>
     * 来源：LeetCode-141
     * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
     * 不允许修改 链表。
     * 输入：head = [3,2,0,-4], pos = 1
     * 输出：返回索引为 1 的链表节点
     * 解释：链表中有一个环，其尾部连接到第二个节点。
     */
    //todo:从环的开头再走一遍，相遇的地方就是环的头结点（难！）
    //求环的头结点
    public static ListNode detectCycle(ListNode head) {
        //链表本身为空或者链表只有一个节点，都是是无环的
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //如果相遇，代表有环
            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    /**
     * 求环的长度
     */
    public static int cycleLen(ListNode head) {
        //链表本身为空或者链表只有一个节点，都是是无环的
        if (head == null || head.next == null) return -1;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //如果相遇，代表有环
            if (slow == fast) {
                int path = 1;
                slow = slow.next;
                fast = fast.next.next;
                while (fast != slow) {
                    path++;
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return path;
            }
        }
        return -1;
    }
}
