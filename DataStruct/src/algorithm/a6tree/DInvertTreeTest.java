package algorithm.a6tree;

import org.junit.jupiter.api.Test;

/**
 * 翻转二叉树
 * <p>
 * 来源：LeetCode-226
 * <p>
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class DInvertTreeTest {
    TreeNode tree = BCreateTree.createTree();
    @Test
    public void invertTree() {

        DInvertTree.invertTree(tree);
        System.out.println(tree);
    }

    @Test
    public void invertTree3() {
        DInvertTree.invertTree3(tree);
        System.out.println(tree);
    }
}