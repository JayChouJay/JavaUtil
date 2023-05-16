package algorithm.a6tree;

import java.util.Arrays;

/**
 * 给出前序和中序，中序和后序能够定位一颗二叉树
 * <p>
 * 给出前序和后序无法定位二叉树
 * <p>
 * 有点烧脑，没懂
 */
public class EBuildTreeByOrder {
    /**
     * 中序和后序定位二叉树
     */
    public static TreeNode buildTree(int[] preOrder, int[] inOrder) {
        //递归出口
        if (preOrder.length == 0) return null;

        //在前序结果中 找到根节点
        int rootValue = preOrder[0];
        TreeNode root = new TreeNode(rootValue);

        //查找根节点在中序结果中的位置
        int leftSize = find(inOrder, rootValue);

        //切分出左子树的前序和中序结构
        //使用Arrays.cppyOfRange方法 三个参数 原始数组 起始位置 终止位置
        //【起始位置，终止为止)
        //2 3 4 【1，leftSize+1)
        //3 4 2 【0，leftSize)
        int[] leftPreOrder = Arrays.copyOfRange(preOrder, 1, leftSize + 1);
        int[] leftInOrder = Arrays.copyOfRange(inOrder, 0, leftSize);
        root.left = buildTree(leftPreOrder, leftInOrder);

        //切分出右子树的前序和中序结果
        //5 【leftSize,end)
        //5 【leftSize+1,end)
        int[] rightPreOrder = Arrays.copyOfRange(preOrder, leftSize + 1, preOrder.length);
        int[] rightInOrder = Arrays.copyOfRange(inOrder, leftSize + 1, inOrder.length);
        root.right = buildTree(rightPreOrder, rightInOrder);

        return root;
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 前序和后序定位二叉树
     */
    public static TreeNode buildTree1(int[] inOrder, int[] postOrder) {
        //递归出口
        if (inOrder.length == 0 || postOrder.length == 0) return null;

        //在前序结果中 找到根节点
        int rootValue = postOrder[postOrder.length - 1];
        TreeNode root = new TreeNode(rootValue);

        //查找根节点在中序结果中的位置
        int leftSize = find(inOrder, rootValue);

        //切分出左子树的中序和后序结构
        //使用Arrays.cppyOfRange方法 三个参数 原始数组 起始位置 终止位置
        //【起始位置，终止为止)
        //3 4 5 【0，leftSize)
        //4 3 2 【0，leftSize)
        int[] leftInOrder = Arrays.copyOfRange(inOrder, 0, leftSize);
        int[] leftPostOrder = Arrays.copyOfRange(postOrder, 0, leftSize);
        root.left = buildTree1(leftInOrder, leftPostOrder);

        //切分出右子树的中序和后序结果
        //5 【leftSize+1,end)
        //5 【leftSize,end-1)
        int[] rightInOrder = Arrays.copyOfRange(inOrder, leftSize + 1, inOrder.length);
        int[] rightPostOrder = Arrays.copyOfRange(postOrder, leftSize, postOrder.length - 1);
        root.right = buildTree1(rightInOrder, rightPostOrder);

        return root;
    }

}
