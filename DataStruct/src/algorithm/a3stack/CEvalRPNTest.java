package algorithm.a3stack;

import org.junit.jupiter.api.Test;

public class CEvalRPNTest {
    String[]tokens={"2","1","+","3","*"};
    String[]tokens2={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    @Test
    public void evalRPN() {

        System.out.println(CEvalRPN.evalRPN(tokens));
        System.out.println(CEvalRPN.evalRPN(tokens2));
    }

    @Test
    public void evalRPN2() {
        System.out.println(CEvalRPN.evalRPN2(tokens));
        System.out.println(CEvalRPN.evalRPN(tokens2));
    }
}
