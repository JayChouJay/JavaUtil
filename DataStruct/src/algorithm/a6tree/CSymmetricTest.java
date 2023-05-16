package algorithm.a6tree;

import org.junit.jupiter.api.Test;

public class CSymmetricTest {
    Integer[] arr1 = {1, 2, 2, 3, 4, 4, 3};
    Integer[] arr2 = {1, 2, 2, 3, 4, 4};
    TreeNode node = BCreateTree.createByArray(arr1, 0);
    TreeNode node2 = BCreateTree.createByArray(arr2, 0);
    @Test
    public void isSymmetric() {
        System.out.println(CSymmetric.isSymmetric(node));
        System.out.println(CSymmetric.isSymmetric(node2));
    }

    @Test
    public void isSymmetric2() {
        System.out.println(CSymmetric.isSymmetric2(node));
        System.out.println(CSymmetric.isSymmetric2(node2));
    }
}