package algorithm.a3stack;

import org.junit.jupiter.api.Test;

public class CReversePolishNotationTest {
    String str="1+((2+3)*4)-5";
    @Test
    public void transfer(){

        CReversePolishNotation.transfer(str);
    }
}
