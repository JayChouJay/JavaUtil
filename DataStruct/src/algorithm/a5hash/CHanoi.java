package algorithm.a5hash;

/**
 * 汉诺塔
 * <p>
 * 不能转化为迭代
 */
public class CHanoi {
    //有n个圆盘，需要从柱子A移动到C，经由B
    /**
     *
     * @param n n个圆盘
     * @param A 起始
     * @param B 中间
     * @param C 终点
     */
    public static void hanoi(int n, char A, char B, char C) {
        //出口
        if (n == 1) {
            System.out.println(A + "->" + C);
            return;
        }

        //先把前N-1个圆盘 从A移动到B（经由C)
        //再把最大的圆盘 从A移动到C
        //最后把前N-1个圆盘 从B移动到C（经由A)
        hanoi(n - 1, A, C, B);
        System.out.println(A + "->" + C);
        hanoi(n - 1, B, A, C);
    }
}
