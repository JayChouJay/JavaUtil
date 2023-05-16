package algorithm.a5hash;

import org.junit.jupiter.api.Test;

public class CFibonacciTest {
    private int num = 48;

    @Test
    public void fib() {
        for (int i = 1; i < num; i++) {
            System.out.println("第-"+i+"-个月的兔子数列:\t"+CFibonacci.fib(i));
        }
    }

    @Test
    public void fib2() {
        for (int i = 1; i < num; i++) {
            System.out.println("第-"+i+"-个月的兔子数列:\t"+CFibonacci.fib2(i));
        }
    }
    @Test
    public void fib3() {
        for (int i = 1; i < num; i++) {
            System.out.println("第-"+i+"-个月的兔子数列:\t"+CFibonacci.fib3(i));
        }
    }
}
