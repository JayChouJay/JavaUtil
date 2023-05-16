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
        System.out.println();
        BTreeSearch2.preOrder(node);
    }

    /**
     * 中序
     */
    @Test
    public void inOrder() {
        BTreeSearch.inOrder(node);
        System.out.println();
        BTreeSearch2.inOrder(node);
    }

    /**
     * 后续
     */
    @Test
    public void lastOrder() {
        BTreeSearch.postOrder(node);
        System.out.println();
        BTreeSearch2.postOrder(node);
    }
    /**
     * 广度遍历
     */
    @Test
    public void bfs() {
        BTreeSearch.bfs(node);
    }
}
