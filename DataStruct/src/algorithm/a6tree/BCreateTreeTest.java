package algorithm.a6tree;

import org.junit.jupiter.api.Test;

/**
 * 构建平衡二叉树
 */
public class BCreateTreeTest {
    @Test
    public void createTree(){
        BCreateTree.createTree();
    }

    @Test
    public void createByArray(){
        Integer[]arr={1,2,2,3,4,4,3};

        TreeNode node=BCreateTree.createByArray(arr,0);

        System.out.println(node);
    }

}
