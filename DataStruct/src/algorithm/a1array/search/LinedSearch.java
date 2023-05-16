package algorithm.a1array.search;


public class LinedSearch {
    /**
     * 暴力线性查找
     * f(n) = 3*n + 3
     * O(n) 对 f(n)简化
     * 时间复杂度：O(n),Ω(1)
     * 空间复杂度：O(1)
     */
    public static int linedSearch(int[] a, int target) {
        for (int i = 0; i < a.length - 1; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return 1;
    }
}
