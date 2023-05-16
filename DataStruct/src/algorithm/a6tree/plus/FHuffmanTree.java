package algorithm.a6tree.plus;

import java.util.Collections;
import java.util.List;

/**
 * 功能描述：构造赫夫曼树
 */
public class FHuffmanTree {
    //实现Comparable 使用集合工具类提供的排序方法
    public static class Node<E> implements Comparable<Node> {
        //数据
        E data;
        //权重
        int weight;
        //左右孩子
        Node leftChild;
        Node rightChild;

        public Node(E data, int weight) {
            this.data = data;
            this.weight = weight;
        }

        //保证 权重小的在前，权重大的在后
        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }


    public static Node createTree(List<Node> nodes) {

        //当剩余节点数量为1时，代表树构造完成
        while (nodes.size() > 1) {
            //保证队列有序
            Collections.sort(nodes);

            //取出最上层的两个节点，构造树
            Node left = nodes.get(0);
            Node right = nodes.get(1);

            //求和 得出新的父节点
            Node parent = new Node(' ', left.weight + right.weight);
            parent.leftChild = left;
            parent.rightChild = right;

            //移除最上层的两个节点
            nodes.remove(0);
            nodes.remove(0);

            //存入父节点
            nodes.add(parent);
        }
        //剩余节点 == 树的根节点  最终返回
        return nodes.get(0);
    }

}
