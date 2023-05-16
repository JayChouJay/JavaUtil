package algorithm.a6tree;

import org.junit.jupiter.api.Test;

public class BSameTreeTest {
    @Test
    public void isSameTree() {
        //还没验证，生成树比较困难
        Integer[] arr1={1,2,3,4,5,6,7};
        Integer[] arr2={1,2,3,4,5,6};
        TreeNode node1=BCreateTree.createByArray(arr1,0);
        TreeNode node2=BCreateTree.createByArray(arr2,0);

        System.out.println(BSameTree.isSameTree(node1, node2));
    }
}
