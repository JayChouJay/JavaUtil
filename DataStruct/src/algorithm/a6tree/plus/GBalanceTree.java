package algorithm.a6tree.plus;

import algorithm.a6tree.AMaxDepth;
import algorithm.a6tree.TreeNode;

public class GBalanceTree {
    //第一种求取方式
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = AMaxDepth.maxDepth(root.left);
        int rightDepth = AMaxDepth.maxDepth(root.right);
        int bf = Math.abs(leftDepth - rightDepth);
        if (bf > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //第二种求取方式 将两个都使用递归的方法 合并到一个方法中，提升效率
    public static boolean isBalanced1(TreeNode root) {
        return depth1(root) != -1;
    }

    //求取高度时 同事比较是否平衡
    //平衡时返回高度本身 不平衡时返回-1（不存在的高度）
    public static int depth1(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth1(root.left);
        //左子树不平衡 则整棵树都不平衡
        if (leftDepth == -1) return -1;
        int rightDepth = depth1(root.right);
        if (rightDepth == -1) return -1;

        //不平衡返回-1
        if (Math.abs(leftDepth - rightDepth) > 2) {
            return -1;
        }
        //平衡返回树的高度
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
