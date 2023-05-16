package algorithm.a0simple;

import org.junit.jupiter.api.Test;

/**
 * 功能描述：时间复杂度练习
 * <p>
 * 复杂度消耗时间的关系：
 * O(1)<O(logN)<O(n)<O(nlogN)<O(n<2)<O(n^3)<O(n^k)
 */
public class TimeTest {
    /**
     * 常数阶O(1)
     */
    public void constant() {
        int i = 1;
        int j = 2;
        i = i + j;
        j = 3;
    }

    /**
     * f(n)=1+1+n+n=2+2n
     * <p>
     * 线性阶O(n)
     */
    @Test
    public void foreach() {
        int j = 1, n = 100;
        for (int i = 0; i < n; i++) {
            j = i;
            j++;
        }
    }

    /**
     * 对数阶
     * O(logN)
     */
    public void foreach2() {
        int i = 1, n = 100;
        while (i < n) {
            i *= 2;
        }
    }

    /**
     * 线性对数阶
     * O(nlogN)
     */
    public void foreach3() {
        int n = 100;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                j *= 2;
            }
        }
    }

    /**
     * 平方阶O(n^2)
     * 立方阶O(n^3)
     * k次方阶O(n^k)
     */
    public void foreach4() {
        int n = 100;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //TODO
            }
        }
    }
    /**
     * 指数阶O(2^n)
     * 阶乘阶O(n!)
     * 由于运行时间过大，无太多实际意义
     */
}
