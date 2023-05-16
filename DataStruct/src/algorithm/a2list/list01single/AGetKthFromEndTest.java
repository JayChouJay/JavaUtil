package algorithm.a2list.list01single;


import algorithm.a2list.list01single.bean.ListNode;
import org.junit.jupiter.api.Test;


public class AGetKthFromEndTest {
    private ListNode node=new ListNode(1);
    private ListNode node2=new ListNode(2);
    private ListNode node3=new ListNode(3);
    private ListNode node4=new ListNode(4);
    private ListNode node5=new ListNode(5);
    {
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
    }
    @Test
    public void getKthFromEnd() {
        System.out.println(AGetKthFromEnd.getKthFromEnd(node, 2));
    }

    @Test
    public void getKthFromEnd2() {
        System.out.println(AGetKthFromEnd.getKthFromEnd2(node, 2));
    }
}
