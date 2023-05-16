package algorithm.a1array;

import org.junit.jupiter.api.Test;


public class ATwoSumTest {
    /**
     * 1.判断数组中两数是否能组成目标值 - 测试
     */
    @Test
    public void twoSum() {
        int[] nums = new int[]{3, 2, 4};
        ATwoSum.twoSum(nums, 6);
    }
}
