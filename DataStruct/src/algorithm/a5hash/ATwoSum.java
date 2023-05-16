package algorithm.a5hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * <p>
 * 来源:leetCode-1
 */
public class ATwoSum {
    /**
     * 暴力查找法
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 倒推法
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer needNum = map.get(target - nums[i]);
            //map.containsKey(needNum)
            if (needNum != null && needNum != i) {
                return new int[]{i, needNum};
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 一次hash法
     */
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer needNum = map.get(target - nums[i]);
            //map.containsKey(needNum)
            if (needNum != null) {
                return new int[]{needNum, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
