package algorithm.a6tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 树的遍历
 */
public class BTreeSearch {

    /**
     * 深度优先：先序，中序，后续
     */
    //先序的遍历
    public static void preOrder(TreeNode node) {
        //递归出口
        if (node == null) return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //中序的遍历
    public static void inOrder(TreeNode node) {
        //递归出口
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    //后序的遍历
    public static void postOrder(TreeNode node) {
        //递归出口
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    /**
     * 广度优先遍历
     * 通过队列实现 从根节点开始存储到队列中
     * 对队列元素的处理是：将对头节点的孩子存入队列中，取出对头节点
     * 知道队列为空 所有节点处理完成 同时节点的顺序是按照层级的
     */
    public static void bfs(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(node);
        while (queue.size() > 0) {
            //取出対首元素
            TreeNode node1 = queue.poll();
            System.out.print(node1.val + " ");

            //如果有左孩子或右孩子，将其存入队列
            if (node1.left != null) queue.offer(node1.left);
            if (node1.right != null) queue.offer(node1.right);
        }
    }

}
