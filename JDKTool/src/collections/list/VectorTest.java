package collections.list;

import org.junit.jupiter.api.Test;
import java.util.Vector;

public class VectorTest {
    //初始化
    private Vector vector=new Vector();
    {
        vector.add(1);
        vector.add(6);
        vector.add(4);
    }
    @Test
    public void vectorTest(){
        System.out.println("4.vector重写了toString方法：\t"+vector);
    }
}
