package algorithm.a6tree;

/**
 * 相同的树
 * <p>
 * 来源：LeetCode-100
 * <p>
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class BSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        //递归出口
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        //递归规律
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
