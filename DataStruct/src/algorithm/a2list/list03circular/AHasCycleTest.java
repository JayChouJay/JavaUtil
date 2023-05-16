package algorithm.a2list.list03circular;

import algorithm.a2list.list01single.bean.ListNode;
import org.junit.jupiter.api.Test;

public class AHasCycleTest {
    private int[] arr = {3, 2, 0, 4};

    @Test
    public void toCycle() {

        ListNode node = ListNode.arrayToListNode(arr);
        ListNode.toCycle(node, 1);
    }

    @Test
    public void hasCycle() {
        ListNode node = ListNode.arrayToListNode(arr);
        ListNode.toCycle(node, 1);
        System.out.println("有环吗？：\t" + AHasCycle.hasCycle(node));
    }

    @Test
    public void detectCycle() {
        ListNode node = ListNode.arrayToListNode(arr);
        ListNode.toCycle(node, 1);
        System.out.println("环的头结点：\t" + AHasCycle.detectCycle(node));
    }
    @Test
    public void cycleLen(){
        ListNode node = ListNode.arrayToListNode(arr);
        ListNode.toCycle(node, 1);
        System.out.println("环的长度：\t" + AHasCycle.cycleLen(node));
    }
}
