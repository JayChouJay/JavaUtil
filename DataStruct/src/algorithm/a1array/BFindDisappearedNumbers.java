package algorithm.a1array;

import java.util.*;

/**
 * 找到所有数组中消失的数字
 * <p>
 * 来源：LeetCode-448
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
 * 输入 nums = [4,3,2,7,8,2,3,1]
 * 输出 [5,6]
 */
public class BFindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (0 < num) {
                result.add(i + 1);
            }
        }
        return result;
    }


}
