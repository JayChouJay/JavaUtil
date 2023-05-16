package algorithm.a1array;

import org.junit.jupiter.api.Test;

public class AFindRepeatNumberTest {
    int[] arr={2, 3, 1, 0, 2, 5, 3};
    @Test
    public void findRepeatNumber(){
        System.out.println(AFindRepeatNumber.findRepeatNumber(arr));
    }
    @Test
    public void findRepeatNumber2(){
        System.out.println(AFindRepeatNumber.findRepeatNumber2(arr));
    }
    @Test
    public void findRepeatNumber3(){
        System.out.println(AFindRepeatNumber.findRepeatNumber3(arr));
    }
    @Test
    public void findRepeatNumber4(){
        System.out.println(AFindRepeatNumber.findRepeatNumber4(arr));
    }
}
