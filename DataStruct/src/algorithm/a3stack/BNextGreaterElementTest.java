package algorithm.a3stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BNextGreaterElementTest {
    @Test
    public void nextGreaterElement() {
        int[] nums1 = {2, 3, 5, 1, 0, 7, 4};
        int[] nums2 = {2, 3, 5, 1, 0, 7, 4};
        int[] result = BNextGreaterElement.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
