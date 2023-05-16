package algorithm.a1array.search;

/**
 * Java中的二分查找：Arrays.binarySearch()
 */
public class BinarySearch {
    /**
     * 二分查找基础版
     * <p>
     * 条件：有序数组
     * params: a - 待查找的升序数组
     * target - 待查找的目标值
     * Returns:
     * 找到则返回索引
     * 找不到返回-1
     * <p>
     * 注意点：while（i<=j）
     * f(n)= (floor(log_2(n))+1)*5+4
     * O(n) 对 f(n)简化
     * 时间复杂度：O(log(n)),Ω(1),平均情况：O(log(n))
     * 空间复杂度：O(1)
     * 渐进上界：O(g(n))，含义：算法执行最差的情况
     * 渐进下界：Ω(g(n))，含义：算法执行最优的情况
     * 渐进紧界：θ(g(n))，含义：既能表示最好，又能表示最差
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1;    //设置指针和初值
        while (i <= j) {                //i~j 范围内有东西
//            int m = (i + j) / 2;
            int m = (i + j) >>> 1;
            if (target < a[m]) {        //目标在左边
                j = m - 1;
            } else if (a[m] < target) { //目标在右边
                i = m + 1;
            } else {                    //找到了
                return m;
            }
        }
        return -1;
    }

    /**
     * 边界版二分查询
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchAlternative(int[] a, int target) {
        int i = 0, j = a.length;    //将j作为边界
        while (i < j) {                //i~j 范围内有东西
            int m = (i + j) >>> 1;
            if (target < a[m]) {        //目标在左边
                j = m;
            } else if (a[m] < target) { //目标在右边
                i = m + 1;
            } else {                    //找到了
                return m;
            }
        }
        return -1;
    }

    /**
     * 平衡版二分查询
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearch3(int[] a, int target) {
        int i = 0, j = a.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                i = m;
            } else {
                j = m;
            }
        }
        if (a[i] == target) {
            return i;
        } else
            return -1;
    }

}
