package algorithm.a5hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 * <p>
 * 来源：LeetCode-509
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * <p>
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给定 n ，请计算 F(n) 。
 */
public class CFibonacci {
    /**
     * 递归
     */
    //1,1,2,3,5,8
    public static int fib(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * 递归转迭代-Map
     * Make it work,Make it right,Make it fast
     */
    public static int fib2(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
        for (int i = 3; i <= n; i++) {
            int last1 = map.get(i - 1);
            int last2 = map.get(i - 2);
            // System.out.println(last1+" "+last2);
            map.put(i, last1 + last2);
        }
        return map.get(n);
    }

    /**
     * 递归转迭代-数组
     */
    public static int fib3(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;

        for (int i = 3; i <= n; i++) {
            int last1 = result[i - 1];
            int last2 = result[i - 2];
            result[i] = last1 + last2;
        }
        return result[n];
    }
}
