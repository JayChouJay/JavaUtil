package algorithm.a6tree;

import org.junit.jupiter.api.Test;

public class EBuildTreeByOrderTest {
    @Test
    public void buildTree() {
        int[] preOrder = {1, 2, 3, 4, 5};
        int[] inOrder = {3, 4, 2, 1, 5};

        TreeNode node = EBuildTreeByOrder.buildTree(preOrder, inOrder);
        System.out.println(node);

    }
    @Test
    public void buildTree1() {

        int[] inOrder = {3, 4, 2, 1, 5};
        int[] postOrder = {4,3,2,5,1};
        TreeNode node = EBuildTreeByOrder.buildTree1(inOrder, postOrder);
        System.out.println(node);

    }
}
