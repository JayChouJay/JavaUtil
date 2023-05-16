package algorithm.a1array;

import org.junit.jupiter.api.Test;

public class BFindDisappearedNumbersTest {
    private int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    private int[] nums2 = {1,1};

    @Test
    public void findDisappearedNumbers() {
        System.out.println(BFindDisappearedNumbers.findDisappearedNumbers(nums));
        System.out.println(BFindDisappearedNumbers.findDisappearedNumbers(nums2));
    }
    @Test
    public void findDisappearedNumbers2() {
        System.out.println(BFindDisappearedNumbers.findDisappearedNumbers2(nums));
        System.out.println(BFindDisappearedNumbers.findDisappearedNumbers2(nums2));
    }
}
