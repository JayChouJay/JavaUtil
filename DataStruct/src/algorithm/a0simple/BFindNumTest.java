package algorithm.a0simple;

import org.junit.jupiter.api.Test;

public class BFindNumTest {
    @Test
    public void daffodils() {
        BFindNum.daffodils(10000);
    }

    @Test
    public void isDaffodils() {
        BFindNum.isDaffodils(155);
    }

    @Test
    public void findPrimeNumbers() {
        BFindNum.findPrimeNumbers(10000);
    }

    @Test
    public void isHappy() {
        for (int i = 0; i < 100000; i++) {
            if (BFindNum.isHappy(i)) {
                System.out.println(i + "---是快乐数");
            }
        }
    }
}
