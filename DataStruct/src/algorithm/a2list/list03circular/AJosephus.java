package algorithm.a2list.list03circular;

import algorithm.Tool;
import algorithm.a2list.list01single.bean.ListNode;

public class AJosephus {
    /**
     * 环形链表
     * <p>
     * 传入 n（链表长度）,m（删除的数字）
     * 返回留下的一个数字
     */
    public static int josephus(int n, int m) {
        //初始化环形链表
        int[] arr = new int[n];
        Tool.intBatch(arr, 1);
        ListNode node = ListNode.arrayToListNode(arr);
        //成环
        ListNode.toCycle(node, 0);

        int cnt = 1;
        while (node != node.next) {
            if (cnt == m - 1) {
                System.out.println("删除节点：\t" + node.next.data);
                node.next = node.next.next;
                cnt = 0;
            }
            node = node.next;
            cnt++;
        }
        return (int) node.data;
    }

    /**
     * 数组遍历法
     */
    public static int josephus2(int n, int m) {
        //初始化数组
        int[] people = new int[n];
        //人的索引
        int index = -1;
        //报数 1 2 ... m
        int cnt = 0;
        //剩余人数
        int remain = n;

        while (remain > 0) {
            index++;
            //到达数组末端，重新从头遍历
            if (index >= n) index = 0;

            //如果此人死掉，跳过，继续报数
            if (people[index] == -1) continue;
            //如果此人或者，但是报数为m，置为-1
            if (cnt == m) {
                System.out.println("删除了：\t" + index);
                people[index] = -1;
                cnt = 0;
                remain--;
            }
            cnt++;
        }
        //返回最后一个死掉的人
        return index;
    }
}
