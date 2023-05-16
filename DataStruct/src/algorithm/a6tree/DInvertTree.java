package algorithm.a6tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 翻转二叉树
 * <p>
 * 来源：LeetCode-226
 * <p>
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class DInvertTree {
    /**
     * 深度优先遍历-前序遍历（我写的）
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invert(root, root.left, root.right);
        return root;
    }

    private static void invert(TreeNode root, TreeNode node1, TreeNode node2) {
        //递归出口
        if (node1 == null && node2 == null) return;

        if (node1 == null) {
            root.left = node2;
            root.right = null;
            invert(node2, node2.left, node2.right);
            return;
        }
        if (node2 == null) {
            root.right = node1;
            root.left = null;
            invert(node1, node1.left, node1.right);
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invert(root.left, root.left.left, root.left.right);
        invert(root.right, root.right.left, root.right.right);
    }

    /**
     * 前序遍历-优化版
     * <p>
     * 前中后三个算法都可以转化为迭代
     */
    public static TreeNode invertTree2(TreeNode root) {
        //递归的出口
        if (root == null) return null;
        //方案一
        //先将左右子树交换，然后在分别 翻转左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree2(root.left);
        invertTree2(root.right);
        return root;
    }

    /**
     * 中序遍历
     */
    public static TreeNode invertTree3(TreeNode root) {
        //递归的出口
        if (root == null) return null;
        //方案二
        //先翻转左子树，然后交换左右子树 再反转左子树（原来的右子树）
        invertTree3(root.left);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree3(root.left);
        return root;
    }

    /**
     * 后序遍历
     */
    public static TreeNode invertTree4(TreeNode root) {
        //递归的出口
        if (root == null) return null;
        //方案三
        //先翻转左子树， 再反转右子树，然后交换左右子树
        invertTree4(root.left);
        invertTree4(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        return root;
    }

    /**
     * 广度优先遍历
     */
    public static TreeNode invertTree5(TreeNode root) {
        //递归的出口
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //方案三
        //先翻转左子树， 再反转右子树，然后交换左右子树
        while (queue.size() > 0) {
            //取出対首元素
            TreeNode current = queue.poll();
            //交换此节点的左右子树
            TreeNode tmp = current.left;
            current.left = current.right;
            current.right = tmp;

            //如果有左孩子 或者右孩子 将其存入队列
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }

        return root;
    }

}