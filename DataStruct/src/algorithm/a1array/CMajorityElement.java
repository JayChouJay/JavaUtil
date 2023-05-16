package algorithm.a1array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 多数元素
 * <p>
 * 来源：leetcode-169
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 输入 nums = [3,2,3]
 * 输出 3
 * 输入 nums = [2,2,1,1,1,2,2]
 * 输出 2
 */
public class CMajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 1;
            if (map.containsKey(num)) {         //如果包含元素，count++；
                count = map.get(num);
                count++;
            }
            //判断是否是多数元素
            if (nums.length / 2 < count)
                return num;
            map.put(num, count);
        }
        return -1;
    }

    public static int majorityElement2(int[] nums) {
        //对数组排序
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 候选人算法
     */
    public static int majorityElement3(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (candidate == num) {
                count++;
            } else {
                if (count == 0) {
                    candidate = num;
                    count++;
                } else count--;
            }
        }
        return candidate;
    }
}
