package algorithm.a6tree.plus;

import org.junit.jupiter.api.Test;

public class EThreadBinaryTreeTest {
    @Test
    public void threadBinaryTree(){
        EThreadBinaryTree root=new EThreadBinaryTree('A');
        root.left=new EThreadBinaryTree('B');
        root.right=new EThreadBinaryTree('C');
        root.left.right=new EThreadBinaryTree('D');
        root.right.left=new EThreadBinaryTree('E');

        EThreadBinaryTree.inThread(root);
        System.out.println(root);
    }
}
