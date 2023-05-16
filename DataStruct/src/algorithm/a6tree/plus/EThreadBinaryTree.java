package algorithm.a6tree.plus;

public class EThreadBinaryTree {
    //节点数据
    char data;
    //ltag 左孩子是否为线索
    boolean leftIsThread;
    //ttag 右孩子是否为线索
    boolean rightIsThread;
    //左子树
    EThreadBinaryTree left;
    //右子树
    EThreadBinaryTree right;

    public EThreadBinaryTree(char data) {
        this.data = data;
        this.leftIsThread = false;
        this.rightIsThread = false;
    }

    //记录线索化时的前驱节点
    static EThreadBinaryTree pre = null;

    //按照中序遍历结果 线索化 BDAEC
    public static void inThread(EThreadBinaryTree root) {
        if (root == null) return;

        //先左 - 中 -右
        inThread(root.left);
        //线索化自身
        if (root.left == null) {
            root.leftIsThread = true;
            //将left设置为前驱结点
            root.left = pre;
            if (pre != null) {
                System.out.println("设置" + root.data + "的前驱结点为：" + pre.data);
            }
        }

        //pre一定是前驱 root是pre的后置
        if (null != pre && pre.right == null) {
            pre.rightIsThread = true;
            pre.right = root;
            System.out.println("设置" + pre.data + "的后继结点为：" + root.data);
        }
        pre = root;
        inThread(root.right);
    }
}
