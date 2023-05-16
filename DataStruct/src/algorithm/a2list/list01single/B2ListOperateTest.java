package algorithm.a2list.list01single;

import mystruct.bean.Node;
import org.junit.jupiter.api.Test;

public class B2ListOperateTest {
    Node a1 = new Node(1);
    Node a2 = new Node(3);
    Node a3 = new Node(5);
    Node a4 = new Node(6);
    Node b1 = new Node(2);
    Node b2 = new Node(3);
    Node b3 = new Node(4);
    Node b4 = new Node(5);
    Node b5 = new Node(6);

    {
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
    }

    @Test
    public void mergeLinked() {
        Node result = B2ListOperate.mergeLinked(a1, b1);
    }

    @Test
    public void reverse() {
        B2ListOperate.reverse(b1);

        //遍历b1
        Node target = b5;
        while (target != null) {
            System.out.println(target.val);
            target = target.next;
        }
    }

    @Test
    public void sum() {
        System.out.println(B2ListOperate.sum(a1));
    }
}
