package algorithm.a1array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 数组中重复的数字
 * <p>
 * 来源：leetCode-剑值-03
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 输入：[2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class AFindRepeatNumber {

    public static int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int findRepeatNumber3(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (tmp[nums[i]] != 0) {
                return nums[i];
            } else {
                tmp[nums[i]] = 1;
            }

        }
        return -1;
    }

    /**
     * 交换位置查找方式
     */
    public static int findRepeatNumber4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) continue;
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            } else {
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
                i--;
            }
            System.out.println(Arrays.toString(nums));
        }
        return -1;
    }
}
