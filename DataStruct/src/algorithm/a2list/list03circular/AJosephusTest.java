package algorithm.a2list.list03circular;

import org.junit.jupiter.api.Test;

public class AJosephusTest {

    @Test
    public void josephus() {
        System.out.println(AJosephus.josephus(10, 3));
        System.out.println(AJosephus.josephus(41, 3));
    }

    @Test
    public void josephus2() {
        System.out.println(AJosephus.josephus2(10, 3));
        System.out.println(AJosephus.josephus2(41, 3));
    }

}