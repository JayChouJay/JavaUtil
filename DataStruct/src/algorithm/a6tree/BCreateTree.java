package algorithm.a6tree;

import algorithm.Tool;

import java.util.LinkedList;
import java.util.List;

/**
 * 构建平衡二叉树
 */
public class BCreateTree {
    //数组长度
    private static final int ARRAY_LENGTH = 10;
    //初始化数组
    private static int[] array = new int[ARRAY_LENGTH];
    //储存生成的节点
    private static List<TreeNode> nodeList = new LinkedList<>();


    public static TreeNode createTree() {
        //数组赋值
        Tool.intBatch(array, 1);
        // System.out.println(Arrays.toString(array));
        //构建节点
        for (int i = 0; i < array.length; i++) {
            TreeNode node = new TreeNode(array[i]);
            nodeList.add(node);
        }
        //构建节点之间的关系
        for (int i = 0; i < nodeList.size() / 2; i++) {
            TreeNode node = nodeList.get(i);
            node.left = nodeList.get(i * 2 + 1);
            //最后一个父节点 可能没有右孩子 需要额外判断
            if (i * 2 + 2 < nodeList.size())
                node.right = nodeList.get(i * 2 + 2);
        }
        return nodeList.get(0);
    }

    //根据数组和索引位置 关联出左右子树
    public static TreeNode createByArray(Integer[] array, int index) {
        //递归出口
        if (index >= array.length) return null;
        if (array[index] == null) return null;

        //递归的规律
        TreeNode node = new TreeNode(array[index]);
        node.left = createByArray(array, 2 * index + 1);
        node.right = createByArray(array, 2 * index + 2);
        return node;
    }
}
