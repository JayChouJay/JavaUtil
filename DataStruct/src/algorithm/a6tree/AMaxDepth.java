package algorithm.a6tree;

/**
 * 二叉树的深度
 * 来源：LeetCode-剑指Offer-55I
 */
public class AMaxDepth {
    /**
     * 我写的，难懂版
     * 有问题：如果root为空！！！
     *
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        //树的深度，左子树的深度和右子树的深度中，更大的值+1
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return maxDepth(root.right) + 1;
        } else if (root.right == null) {
            return maxDepth(root.left) + 1;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 简化版
     * 递归
     */
    public static int maxDepth2(TreeNode root) {
        //树的深度，左子树的深度和右子树的深度中，更大的值+1
        if (root == null) return 0;
        int leftDepth = maxDepth2(root.left);
        int rightDepth = maxDepth2(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
