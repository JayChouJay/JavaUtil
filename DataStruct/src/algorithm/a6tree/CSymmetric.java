package algorithm.a6tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称二叉树
 * <p>
 * 来源：LeetCode-101
 * <p>
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class CSymmetric {
    /**
     * 广度优先遍历-递归
     */
    public static boolean isSymmetric(TreeNode root) {
        // 排除空树的情况
        if (root == null) return true;
        //拆分成左右子树 递归判断
        return isMirror(root.left, root.right);
    }

    //将树拆解为 左子树A 右子树B
    //A的左子树和B的右子树要对称
    //A的右子树和B的左子树要对称
    public static boolean isMirror(TreeNode node1, TreeNode node2) {
        //递归的出口
        if (node1 == null && node2 == null) return true;
        //判断是否不对称
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) return false;

        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    /**
     * 广度优先算法-遍历转迭代
     */
    public static boolean isSymmetric2(TreeNode root) {
        // 排除空树的情况
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            // 递归的出口
            if (node1 == null && node2 == null) continue;
            //判断是否不对称
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;

            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);

        }
        return true;
    }
}