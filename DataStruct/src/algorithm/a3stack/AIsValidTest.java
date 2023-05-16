package algorithm.a3stack;

import org.junit.jupiter.api.Test;

public class AIsValidTest {
    @Test
    public void isValid(){
        System.out.println(AIsValid.isValid("()[]{}"));
        System.out.println(AIsValid.isValid("([)]"));
        System.out.println(AIsValid.isValid("()]"));
        System.out.println(AIsValid.isValid("([]"));
    }

    @Test
    public void isValid2(){
        System.out.println(AIsValid.isValid2("()[]{}"));
        System.out.println(AIsValid.isValid2("([)]"));
        System.out.println(AIsValid.isValid2("()]"));
        System.out.println(AIsValid.isValid2("([]"));
    }
}
