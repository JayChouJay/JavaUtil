package algorithm.a1array;

import org.junit.jupiter.api.Test;

public class CMajorityElementTest {
    private int[] nums = {2, 2, 1, 1, 1, 2, 2};
    private int[] nums2 = {3,2,3};
    @Test
    public void majorityElement() {
        System.out.println(CMajorityElement.majorityElement(nums));
        System.out.println(CMajorityElement.majorityElement(nums2));
    }

    @Test
    public void majorityElement2() {
        System.out.println(CMajorityElement.majorityElement2(nums));
        System.out.println(CMajorityElement.majorityElement2(nums2));
    }
    @Test
    public void majorityElement3() {
        System.out.println(CMajorityElement.majorityElement3(nums));
        System.out.println(CMajorityElement.majorityElement3(nums2));
    }
}
