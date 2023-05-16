package algorithm.a2list.list01single.bean;

import org.junit.jupiter.api.Test;

public class ListNodeTest {
    @Test
    public void string() {
        String[] arr = {"王者荣耀", "和平精英", "开心消消乐", "欢乐斗地主"};
        ListNode<String> node = ListNode.arrayToListNode(arr);
    }
    @Test
    public void integer() {
    }


}
