package algorithm.a0simple;


import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 水仙花数
 * 质数
 * 相关：快乐数
 */
public class BFindNum {
    /**
     * 1.找到水仙花数
     */
    public static void daffodils(int num) {
        for (int i = 1; i <= num; i++) {
            if(isDaffodils(i)){
                System.out.println("水仙花数：" + num);
            }
        }
    }

    /**
     * 是否是水仙花数
     */
    public static boolean isDaffodils(int num) {
        String num1 = num + "";
        char[] nums = num1.toCharArray();
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] - 48) * (nums[i] - 48) * (nums[i] - 48);
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    /**
     * 2.找质数
     */
    public static void findPrimeNumbers(int num) {
        //从2遍历到num
        for (int i = 2; i <= num; i++) {
            //如果 i 能2被整除 并且 不等于2
            if (i % 2 == 0 && i != 2) {
                continue;
            }
            //从3开始循环到j*j
            int j = 3;
            for (; j * j <= i; j += 2) {
                //如果被整除，就退出循环
                if (i % j == 0)
                    break;
            }
            //如果j*j超出了i，说明是质数
            if (j * j > i) {
                System.out.println("质数：" + i);
            }
        }
    }

    /**
     * 是否是快乐数（复制来的，估计有问题）
     */
    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();//哈希表记录数位平方和计算过程中的每个数
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            int sum = 0;
            while (n > 0) {//计算数位平方和
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;//n 为数位平方和
        }
        return n == 1;
    }

}
