package exception;

import exception.domain.IDCard;
import exception.domain.Person;
import org.junit.jupiter.api.Test;


public class StackOverflowError {
    @Test
    public void person() {
        Person p = new Person(1, "周杰伦", new IDCard(1, "410326", "河南", null));
        //可以指向内部对象
        p.getIdCard().setPerson(p);
        //但是不能出发递归
        System.out.println(p);
    }
}
