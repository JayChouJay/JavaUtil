package algorithm.a6tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 树的遍历-栈替代递归
 */
public class BTreeSearch {

    /**
     * 深度优先：先序，中序，后续
     * 先序的遍历
     * 入栈的顺序
     */
    public static void preOrder(TreeNode node) {
        if (node == null) return;
        Stack<TreeNode> stack = new Stack();
        //使用指针 记录遍历到哪个节点
        TreeNode p = node;

        while (p != null || !stack.isEmpty()) {
            //入栈 把当前能读到的所有左孩子 存入栈中
            while (p != null) {
                System.out.print(p.val + " ");
                stack.push(p);
                p = p.left;
            }
            //1 2 4 8
            //1 2 9
            //1 5
            //3 6
            //7
            //出栈 弹出栈顶元素 并找到其右孩子
            if (!stack.isEmpty()) {
                p = stack.pop();
                p = p.right;
            }
        }
    }

    /**
     * 中序的遍历
     * 出栈的顺序
     */
    public static void inOrder(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = node;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                p = stack.pop();
                System.out.print(p.val + " ");
                p = p.right;
            }
        }
    }

    /**
     * 后序的遍历
     * 根节点不先从栈中弹出 要在右子树被遍历后 在弹出
     */
    public static void postOrder(TreeNode node) {
        if (node == null) return;

        Stack<TreeNode> stack = new Stack<>();
        //使用指针 记录遍历到哪个节点
        TreeNode p = node;
        //记录上一次访问的节点
        TreeNode prev = null;
        while (p != null || !stack.isEmpty()) {
            //入栈 把当前能读到的所有左孩子 存入栈中
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            //出栈 弹出栈顶元素 并找到其右孩子
            if (!stack.isEmpty()) {
                //节点出栈的逻辑有两种：
                //1）当前节点是叶子节点
                //2) 上一次出栈的节点是当前节点的右孩子
                p = stack.pop();
                if (p.right == null || prev == p.right) {
                    System.out.print(p.val + " ");
                    prev = p;
                    p = null;
                } else {
                    //不满足出栈条件 是因为节点有右孩子，且右孩子没有被访问到
                    stack.push(p);
                    p = p.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;
        preOrder(node1);
        inOrder(node1);
        postOrder(node1);
    }
}
