package algorithm.a5hash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ATwoSumTest {
    private int[] nums = {2, 7, 11, 15};
    private int[] nums2 = {3, 2, 4};
    public int target = 9;
    public int target2 = 6;

    @Test
    public void twoSum() {
        System.out.println(Arrays.toString(ATwoSum.twoSum(nums, target)));
        System.out.println(Arrays.toString(ATwoSum.twoSum(nums2, target2)));
    }

    @Test
    public void twoSum2() {
        System.out.println(Arrays.toString(ATwoSum.twoSum2(nums, target)));
        System.out.println(Arrays.toString(ATwoSum.twoSum2(nums2, target2)));
    }
    @Test
    public void twoSum3() {
        System.out.println(Arrays.toString(ATwoSum.twoSum3(nums, target)));
        System.out.println(Arrays.toString(ATwoSum.twoSum3(nums2, target2)));
    }
}