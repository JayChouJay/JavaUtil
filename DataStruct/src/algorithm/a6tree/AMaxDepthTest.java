package algorithm.a6tree;

import org.junit.jupiter.api.Test;

public class AMaxDepthTest {

    //    3
    //   / \
    //  9  20
    // /  /  \
    //1  15   7
    TreeNode treeNode = new TreeNode(3);
    TreeNode leftNode = new TreeNode(9);
    TreeNode rightNode = new TreeNode(20);

    {
        treeNode.left = leftNode;
        treeNode.right = rightNode;
        leftNode.right = new TreeNode(1);
        rightNode.left = new TreeNode(15);
        rightNode.right = new TreeNode(7);
    }

    @Test
    public void maxDepth() {
        System.out.println(AMaxDepth.maxDepth(treeNode));
    }

    @Test
    public void maxDepth2() {
        System.out.println(AMaxDepth.maxDepth2(treeNode));
    }
}
