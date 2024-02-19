package algorithm.a6tree;

import org.junit.jupiter.api.Test;

/**
 * 树的遍历
 */
public class BTreeSearchTest {
    private TreeNode node = BCreateTree.createTree();

    /**
     * 先序
     */
    @Test
    public void preOrder() {
        BTreeSearch.preOrder(node);
    }

    /**
     * 中序
     */
    @Test
    public void inOrder() {
        BTreeSearch.inOrder(node);
    }

    /**
     * 后续
     */
    @Test
    public void lastOrder() {
        BTreeSearch.postOrder(node);
    }
}
