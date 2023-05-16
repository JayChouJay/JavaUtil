package algorithm.a1array;

import org.junit.jupiter.api.Test;

public class ERemoveElementTest {
    private int[] nums = {3, 2, 2, 3};
    @Test
    public void removeElement() {
        System.out.println(ERemoveElement.removeElement(nums, 3));
    }

    @Test
    public void removeElement2() {
        System.out.println(ERemoveElement.removeElement2(nums, 3));
    }
    @Test
    public void removeElement3() {
        System.out.println(ERemoveElement.removeElement3(nums, 3));
    }
}
