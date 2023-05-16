package algorithm.a4queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AMaxSlidingWindowTest {
    @Test
    public void maxSlidingWindowTest(){
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(AMaxSlidingWindow.maxSlidingWindow(nums, 3)));
    }
}
