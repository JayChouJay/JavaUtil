package algorithm.a1array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DRemoveDuplicatesTest {
    int[] nums = {1, 1, 2};
    int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    @Test
    public void DRemoveDuplicates() {
        System.out.println(DRemoveDuplicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        System.out.println(DRemoveDuplicates.removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }
}
