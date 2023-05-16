package algorithm.a1array;

/**
 * 移除元素
 * 来源：LeetCode-27
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ERemoveElement {
    /**
     * 快慢指针
     */
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /**
     * 对撞指针
     */
    public static int removeElement2(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            if (nums[i] == val) {
                //实现重新判断当前值
                nums[i--] = nums[--len];
            }
        }
        return len;
    }

    public static int removeElement3(int[] nums, int val) {
        int index = 0;
        int len = nums.length;
        while (index < len) {
            if (nums[index++] == val) {
                nums[--index] = nums[--len];
            }
        }
        return len;
    }
}
