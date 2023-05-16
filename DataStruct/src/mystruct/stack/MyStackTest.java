package mystruct.stack;

import org.junit.jupiter.api.Test;

public class MyStackTest {
    @Test
    public void commons() throws Exception {
        Mystack mystack = new Mystack(5);
        mystack.push("1");
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}